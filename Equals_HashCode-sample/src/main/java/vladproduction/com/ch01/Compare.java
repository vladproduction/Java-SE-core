package vladproduction.com.ch01;

public class Compare {
    public static void main(String[] args) {
        String one = "one";
        String one1 = "one";

        boolean isSame = one==one1;
        boolean isEquals = one.equals(one1);

//        System.out.println(isSame);
//        System.out.println(isEquals);

        String one2 = new String("one");

        isSame = one==one2;
        isEquals = one.equals(one2);

        System.out.println(isSame);  //-->compare as reference
        System.out.println(isEquals);  //-->compare as object

    }
}
