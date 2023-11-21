package vladproduction.com.date_calendar;

import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        // Current Date:
        Date start=new Date();
        System.out.println("Start execution: "+start);
        long time;
        // Millions seconds ago:
        time=start.getTime()-1000000000;
        Date t=new Date(time);
        System.out.println("Millions seconds ago: " +t);
        // Time of finishing programme(almost)
        Date finish=new Date();
        System.out.println("Finish execution: "+finish);
        // Duration of working programme:
        System.out.println("Past "+(finish.getTime()-
                start.getTime())+" milliseconds");

    }
}
