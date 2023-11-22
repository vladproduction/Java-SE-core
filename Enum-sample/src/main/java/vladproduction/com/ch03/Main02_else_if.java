package vladproduction.com.ch03;

public class Main02_else_if {
    public static void main(String[] args) {

        Year_Months[] yearMonths = Year_Months.values();
        for (int i = 0; i < yearMonths.length; i++) {
            Year_Months item = yearMonths[i];
            System.out.println(item+" training plan:");
            if (item == Year_Months.JANUARY) {
                item.swimPool();
                item.gimExercise();
            } else if (item == Year_Months.FEBRUARY) {
                item.swimPool();
                item.gimExercise();
            } else if (item == Year_Months.MARCH) {
                item.swimPool();
                item.gimExercise();
                item.running();
            }
        }
    }
}
