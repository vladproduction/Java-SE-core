package vladproduction.com.app01;

public class Auto_Un_Example_slowProcess {
    public static void main(String[] args) {
        Integer i = sumBeforeInclusive(100);
        System.out.println("i = " + i);
    }
        public static Integer sumBeforeInclusive(Integer number) {
            Integer iOb = number;
            if (number > 1) iOb += sumBeforeInclusive(number - 1);
            return iOb;
        }
}

