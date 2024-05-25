package akhi.io.eight;

public class ThreadDemo implements Runnable {
    private static ThreadDemo instance;
    private Thread td;
    private Thread tf;
    private Thread th;



    private ThreadDemo(){

    }
   synchronized public static ThreadDemo getInstance(){
        if(instance == null){
            instance = new ThreadDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadDemo td = ThreadDemo.getInstance();
        ThreadDemo tf = ThreadDemo.getInstance();
        ThreadDemo th = ThreadDemo.getInstance();

        System.out.println(td.hashCode());
        System.out.println(tf.hashCode());
        System.out.println(th.hashCode());
    }

    @Override
    public void run() {
        System.out.println(td.currentThread().getName());
        System.out.println(tf.currentThread().getName());
        System.out.println(th.currentThread().getName());
    }
}
