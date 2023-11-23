package vladproduction.com.String_format02;

public class MyCalculator {

    public void add(int a, int b){
        System.out.println("add; a="+a+"; b="+b);
    }

    public void add2(String a, String b){
        System.out.println("add2; a="+a+"; b="+b);
    }

    public void add3(int a, int b){
        //System.out.println("add3; a="+a+"; b="+b);
        String template = "add3; a=%s; b=%s";
        String text = String.format(template, a, b);
        System.out.println(text);
    }

    public void add4(int a, int b){
        System.out.println(String.format("add4; param1=%s; param2=%s", a, b));
    }


}
