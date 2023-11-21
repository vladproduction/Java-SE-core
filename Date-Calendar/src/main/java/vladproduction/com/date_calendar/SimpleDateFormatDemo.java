package vladproduction.com.date_calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public SimpleDateFormatDemo(String s) {
        SimpleDateFormat df = new SimpleDateFormat(s);
        System.out.println("[1]"+df.format(new Date()));
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Date today = new Date(time);
        SimpleDateFormatDemo sdf = new SimpleDateFormatDemo("ddd - MM - YYYY");
        System.out.println("[2]"+sdf.format(today));

        sdf = new SimpleDateFormatDemo("Рік:\tYYYY\nМісяць:\tMM\nДень:\tdd");
        System.out.println("[3]"+sdf.format(today));
    }

    private Date format(Date today) {
        return today;
    }
}
