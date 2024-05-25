package akhi.io.eight;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinter {
    private static Object object = new Object();
    private static IntPredicate evenCondition = e->e % 2 == 0;
    private static IntPredicate oddCondition = e->e % 2 != 0;
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()->EvenOddPrinter.printNumber(evenCondition));
        CompletableFuture.runAsync(()->EvenOddPrinter.printNumber(oddCondition));

        Thread.sleep(1000);
    }
    public static void printNumber(IntPredicate condition) {
        IntStream.rangeClosed(1,20).filter(condition).forEach(EvenOddPrinter::execute);
    }
    public static void execute(int no){
       synchronized (object) {
           System.out.println(Thread.currentThread().getName() + " : " + no);
           object.notify();
           try {
               object.wait();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
