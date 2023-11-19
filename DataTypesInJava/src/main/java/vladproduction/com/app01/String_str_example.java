package vladproduction.com.app01;

public class String_str_example {
    public static void main(String[] args) {

        String str1 = "Test";
        String str2 = new String ("Test");

        boolean isEquals = str1.equals(str2);
        System.out.println("isEquals = " + isEquals); //???

        System.out.println();
        int hash1 = str1.hashCode();
        int hash2 = str2.hashCode();
        System.out.println("hash1 = " + hash1);
        System.out.println("hash2 = " + hash2);

        boolean isSame = str1==str2;
        System.out.println("isSame = " + isSame); //???

    }
}
