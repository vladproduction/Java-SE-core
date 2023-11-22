package vladproduction.com;

public class Main02 {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = new Integer(5);  //new object created
        Integer c = Integer.valueOf("5");
        Integer d = 5;
        Integer e = new Integer(5);

        System.out.println(a); //5
        System.out.println(b); //5
        System.out.println(a==b); //false
        System.out.println(a==c); //reference compare here //true
        System.out.println(Integer.valueOf(a)==Integer.valueOf(b)); //true
        System.out.println(Integer.valueOf(a)==Integer.valueOf(c));  //true
        System.out.println(a==d); //value compare here //true
        System.out.println(b==e); //reference compare here //false





    }
}
