package akhi.io.hundred;

import java.util.function.Consumer;

public class AmazonApi implements UpiPayment{
    @Override
    public String doPayment(String sourceAccNo, String DestinationAccNo) {
        String txnDate = UpiPayment.datePattern("yyyy-mm-dd");
        return null;
    }

    @Override
    public double getScratchCard() {
        return UpiPayment.super.getScratchCard();
    }

}
