package vladproduction.com.app03;

public class Main {
    public static void main(String[] args) {


        String str2 = new String("Test"); //in heap
        String str1 = "Test"; //string literal - in string pool
        String str3 = "Test";

        System.out.println(str2.hashCode());
        System.out.println(str1.hashCode());

//        2603186
//        2603186

//        depending of ""

        System.out.println(str2.equals(str1)); //true // content equals

        System.out.println(str2==str1); //false

        System.out.println(str3==str1); //true
    }
}
