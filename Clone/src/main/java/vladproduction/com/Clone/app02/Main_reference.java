package vladproduction.com.Clone.app02;

public class Main_reference {
    public static void main(String[] args) {
        System.out.println("new Instance Car-->car1");
        Car car1 = new Car();
        car1.setName("car1");
        car1.setModel("1");
        System.out.println("car1= "+car1);
        System.out.println("car1.hash= "+car1.hashCode());
        System.out.println();

        System.out.println("one more reference:");
        Car car2=car1;
        System.out.println("car2= "+car2);
        System.out.println("car2.hash= "+car2.hashCode());
        System.out.println();
        //totally the same, case it`s one Object with two references
        //so it`s has (== & equal)--> lets see that
        System.out.println("car1==car2 : ");
        System.out.println(car1==car2);
        System.out.println("car1.equals(car2) : ");
        System.out.println(car1.equals(car2));

        System.out.println("now we update for example field #model#");
        car1.setModel("11");
        //see what happen now;
        System.out.println(car1);
        System.out.println(car2);
        //model has been changed; for both references as well
        System.out.println("now we update for example #name# and #model#");
        car2.setName("bmw");
        car2.setModel("x6");
        System.out.println(car1);//still the same but with updated parameters
        System.out.println(car2);
        System.out.println();


        System.out.println("update model for car2 : ");
        //set a new model for car2
        car2.setModel("525");
        //print toString & hashCode to compare
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.hashCode());//still the same but with updated parameters
        System.out.println(car2.hashCode());


    }
}
