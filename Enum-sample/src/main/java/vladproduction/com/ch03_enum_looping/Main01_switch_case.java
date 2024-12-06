package vladproduction.com.ch03_enum_looping;

public class Main01_switch_case {
    public static void main(String[] args) {

        //have to change enum constant to get other value

        Year_Months planner = Year_Months.APRIL;
        switch (planner) {
            case JANUARY:
            case FEBRUARY:
                planner.gimExercise();
                planner.swimPool();
                break;
            case MARCH:
                planner.swimPool();
                planner.gimExercise();
                planner.running();
                break;
            case APRIL:
            case OCTOBER:
                planner.running();
                planner.rideBike();
                planner.swimPool();
                break;
            case MAY:
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                planner.running();
                planner.rideBike();
                planner.swimming();
                break;
            case NOVEMBER:
                planner.running();
                planner.swimPool();
                break;
            case DECEMBER:
                planner.swimPool();
                planner.reload();
        }
    }
}
