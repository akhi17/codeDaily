package akhi.io.eight.multi;

public class SequenceGeneratorTester {
    private static final int NUMBER_OF_THREADS = 3;
    private static final int TOTAL_NUMBERS_IN_SEQ = 10;

    public static void main(String[] args) {
        PrintingThread numbersGenerator = new PrintingThread(NUMBER_OF_THREADS, TOTAL_NUMBERS_IN_SEQ);

        Thread t1 = new Thread(new SequenceGenerator(numbersGenerator, 1), "THREAD-1");
        Thread t2 = new Thread(new SequenceGenerator(numbersGenerator, 2), "THREAD-2");
        Thread t3 = new Thread(new SequenceGenerator(numbersGenerator, 3), "THREAD-3");
        Thread t4 = new Thread(new SequenceGenerator(numbersGenerator, 0), "THREAD-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
