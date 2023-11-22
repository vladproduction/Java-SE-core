package vladproduction.com.ch03;

import java.util.Iterator;

public class Main03 {
    public static void main(String[] args) {
        Year_Months months = Year_Months.JANUARY;
        String x = months.name();
        months.ordinal();

        Iterator<Year_Months>iterator = new Iterator<Year_Months>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Year_Months next() {
                return null;
            }
        };
        System.out.println("="+x);
    }
}
