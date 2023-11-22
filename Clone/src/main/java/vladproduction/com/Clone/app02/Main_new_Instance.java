package vladproduction.com.Clone.app02;



public class Main_new_Instance {
    public static void main(String[] args) {
        //created two new instances of Car (a,b)
        //check metaInformation to compare
        Car a = new Car();
        a.setName("bmw");
        a.setModel("x5");
        System.out.println("a="+a);

        Car b =new Car();
        b.setName("audi");
        b.setModel("a5");
        System.out.println("b="+b);
        System.out.println("a.hash="+a.hashCode());
        System.out.println("b.hash="+b.hashCode());
        System.out.println("a==b-->"+(a==b)); //so as we see it`s two totally different objects
        System.out.println("a.eq(b)-->"+a.equals(b));


        System.out.println();
        System.out.println("Update #model# for Car a");
        //it`ll update only in one Instance, just show and compare
        a.setModel("525");
        System.out.println(a);
        System.out.println(b);
        //the same we can do with other fields to set a new parameters
        //so here is two different Objects

    }
}
