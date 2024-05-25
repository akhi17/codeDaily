package akhi.io.eight.multi;

public class PrintingThread{

    private int currNumber = 1;
    private final int numOfThreads;
    private final int totalNumbersInSeq;

    public PrintingThread(int numOfThreads, int totalNumbersInSeq) {
        this.numOfThreads = numOfThreads;
        this.totalNumbersInSeq = totalNumbersInSeq;
    }
    public void printNumber(int index) {
        synchronized (this) {
            while(currNumber < totalNumbersInSeq-1) {
                while (currNumber % numOfThreads != index) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " + currNumber++);
                notifyAll();
            }
        }
    }
}
