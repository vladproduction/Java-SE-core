package vladproduction.com;

public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;

        System.out.println(a==b);
        System.out.println("-------------------------");
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        Integer c = 2000;
        Integer d = 2000;

        System.out.println(c==d); //false, это ссылки на разные обьекты
        System.out.println(c.equals(d)); // true, внутренне состояние двух обьектов равны

        int e = 3000;
        int f = 3000;
        System.out.println(e==f); // always check value, because this is primitive type

        Integer t = new Integer(10);
        Integer p = new Integer(10);

        System.out.println(t==p);

    }
}
