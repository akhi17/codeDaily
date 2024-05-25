package akhi.io.hundred;

public class EvenOddPrinter implements Runnable{

    Object object;
    static int i = 1;

    public EvenOddPrinter(Object object) {
        this.object = object;
    }
    @Override
    public void run() {
        while (i<=20){
            if(i%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    i++;
                    try {
                        object.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            if (i%2 !=0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    i++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object obj = new Object();
        Runnable thread1 = new EvenOddPrinter(obj);
        Runnable thread2 = new EvenOddPrinter(obj);

        new Thread(thread1,"even").start();
        new Thread(thread2,"odd").start();

    }
}
