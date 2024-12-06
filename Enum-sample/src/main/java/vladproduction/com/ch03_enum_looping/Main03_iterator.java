package vladproduction.com.ch03_enum_looping;

import java.util.Iterator;

public class Main03_iterator {
    public static void main(String[] args) {

        Iterator<Year_Months> iterator = new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < Year_Months.values().length;
            }

            @Override
            public Year_Months next() {
                return Year_Months.values()[index++];
            }
        };

        // Use the iterator to print all months
//        System.out.println("All months:");
//        while (iterator.hasNext()) {
//            Year_Months month = iterator.next();
//            System.out.println(month.name() + " (Ordinal: " + month.ordinal() + ")");
//        }

        // Use the iterator to print all months with Month Number (1-based)
        System.out.println("All months:");
        while (iterator.hasNext()) {
            Year_Months month = iterator.next();
            System.out.println(month.name() + " (Month Number: " + (month.ordinal() + 1) + ")");
        }
    }
}
