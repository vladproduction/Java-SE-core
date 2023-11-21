package vladproduction.class_String;

public class ReplaceString {
    public static void main(String[] args) {
        String str="Мы программируем на ";
        String s,s1,s2,s3,s4;
        s=str.substring(3,19);
        System.out.println(s);
        s1=str.concat("Java");
        System.out.println(s1);
        s2=s1.replace(' ','_');
        System.out.println(s2);
        s3=s1.toLowerCase();
        System.out.println(s3);
        s4=s1.toUpperCase();
        System.out.println(s4);
    }
}
