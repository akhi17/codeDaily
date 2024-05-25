package akhi.io.hundred;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UpiPayment {
    //abstract method
    String doPayment(String sourceAccNo, String DestinationAccNo);

    //default method
    default double getScratchCard(){
        return new Random().nextDouble();
    }
    //static method - utility method
    static String datePattern(String patterns){
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(new Date());
    }

}
