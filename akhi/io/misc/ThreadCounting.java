package akhi.io.misc;

public class ThreadCounting {
    // Starting counter
    int counter = 1;

    static int N;

    public ThreadCounting(Printer printer1, int i, boolean b) {
    }

    public ThreadCounting() {

    }

    public void printOddNumber(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 == 0){
                    try {
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd thread : "+ counter + " ");
                counter++;
                notify();
            }
        }
    }
    public void printEvennumber(){
        synchronized (this){
            while (counter < N){
                while (counter % 2 == 1){
                    try {
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread : "+counter + " ");
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 50;
        ThreadCounting tc = new ThreadCounting();
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                tc.printEvennumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tc.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
