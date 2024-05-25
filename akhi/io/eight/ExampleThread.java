package akhi.io.eight;

public class ExampleThread implements Runnable{

    public ExampleThread(Object o1, Object o2) {
    }

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(new ExampleThread(o1,o2));
        Thread t2 = new Thread(new ExampleThread(o1,o2));


    }
    private Object obj1;
    private Object obj2;
    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        synchronized (obj1){
            try {
                work();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (obj2){
            try {
                work();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void work() throws InterruptedException {
        Thread.sleep(10000);
    }
}
