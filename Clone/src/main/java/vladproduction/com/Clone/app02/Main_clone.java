package vladproduction.com.Clone.app02;

public class Main_clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        //what if we have to create a several Instances
        //need to create method clone() in our class

        //there are two ways of clone Object:
        //1)shadow clone --> for all instances will be the same fields parameters
        //2)deep clone --> more deep method

        System.out.println("1)shadow clone -->");
        Car car = new Car();
        car.setName("bmw");
        car.setModel("x5");
        //using clone()
        Car car1 = car.clone(); //throws CloneNotSupportedException
                                //we have to make Car class Cloneable

        //look at differences car & car1
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        /*so we see two objects, with same characteristic, but
          different hashCodes */
        //what will happen if we change some parameter --> for example #model#
        System.out.println("change some parameter --> 525 #model#");
        car.setModel("525");
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        //changed only for one (car)

        System.out.println("-----------------");
        System.out.println("2)deep clone -->");
        Car car2 = car.clone();
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        System.out.println("change some parameter --> 725 #model# in car");
        System.out.println("change some parameter --> bmw_ECO #name# in car2");
        car.setModel("725");
        car2.setName("bmw_ECO");
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        //

    }
}
