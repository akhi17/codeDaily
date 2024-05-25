package akhi.io.eight.multi;

public class SequenceGenerator implements Runnable{
    private PrintingThread numbersGenerator;
    private int index;

    public SequenceGenerator(PrintingThread numbersGenerator, int index) {
        this.numbersGenerator = numbersGenerator;
        this.index = index;
    }

    @Override
    public void run() {
        numbersGenerator.printNumber(this.index);
    }
}
