package vladproduction.com.ch01;

public class Main {


    public static void main(String[] args) {
        String text = "my simple text";
        String text2 = "my simple text";
        String text3 = new String("my simple text");

        boolean isEqual = text.equals(text2);
        boolean isSame = (text==text2);
        System.out.println("isEqual="+isEqual);
        System.out.println("isSame="+isSame);
        System.out.println("-----------------");
        isEqual = text2.equals(text);
        isSame = (text2==text);
        System.out.println("isEqual="+isEqual);
        System.out.println("isSame="+isSame);

        System.out.println("--------text vs text3---------");
        isEqual = text.equals(text3);
        isSame = (text==text3);
        System.out.println("isEqual="+isEqual);
        System.out.println("isSame="+isSame);

        System.out.println("--------text2 vs text3---------");
        isEqual = text2.equals(text3);
        isSame = (text2==text3);
        System.out.println("isEqual="+isEqual);
        System.out.println("isSame="+isSame);

    }


}
