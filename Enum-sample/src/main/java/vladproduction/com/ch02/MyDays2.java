package vladproduction.com.ch02;

public enum MyDays2 {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3);
    private int n;


    MyDays2(int n) {
        this.n = n;
        System.out.println("constructor");
    }

    public int getN() {

        return n;
    }
}
