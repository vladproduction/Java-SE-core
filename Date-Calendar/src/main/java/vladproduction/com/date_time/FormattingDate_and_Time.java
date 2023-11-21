package vladproduction.com.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDate_and_Time {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        //The ofPattern() method accepts all sorts of values:
        /*
        yyyy-MM-dd
        dd/MM/yyyy
        dd-MMM-yyyy
        E, MMM dd yyyy*/
    }
}
