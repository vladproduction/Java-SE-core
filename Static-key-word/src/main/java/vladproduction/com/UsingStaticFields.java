package vladproduction.com;

public class UsingStaticFields {
    public static void main(String[] args) {

        StaticFields staticFields = new StaticFields(10,200);
        //changing value of static field
        //(using reference on the class)
        StaticFields.statF = -10;
        staticFields.show();
        System.out.println("one more object creating:");
        StaticFields staticFields2 = new StaticFields(1,2);
        //by creating new obj, changing value of static field:
        staticFields.show(); //here we can see that
        staticFields2.statF = -20;
        staticFields2.nonStatF = -300;
        System.out.println("-----show obj1--------");
        staticFields.show();//we see changed static field again


    }
}
