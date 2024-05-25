package akhi.io.eight.multi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class DateFormatter {
    public static void main(String[] args) {
        String timeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy").withZone(ZoneId.systemDefault()).format(Instant.now());
        System.out.println("timeFormat :" + timeFormat);

        String sampleId = UUID.randomUUID().toString();
        System.out.println("sampleId : " + sampleId);
    }
}
