package vladproduction.com.ch03_enum_looping;

public enum Year_Months implements Gim, Swim, Bike, Run, Rest{

    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8),
    SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

//    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
//    SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    private int month;

    Year_Months(int m) {
        this.month = m;
    }
    Year_Months(){

    }

    public int getMonth() {
        return month;
    }

    @Override
    public void rideBike() {
        System.out.println("biking");
    }

    @Override
    public void gimExercise() {
        System.out.println("gim exercise");
    }

    @Override
    public void reload() {
        System.out.println("resting period");
    }

    @Override
    public void running() {
        System.out.println("running");
    }

    @Override
    public void swimming() {
        System.out.println("swimming");
    }

    @Override
    public void swimPool() {
        System.out.println("swimming in pool");
    }


}
