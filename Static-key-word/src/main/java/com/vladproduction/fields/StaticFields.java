package com.vladproduction.fields;

public class StaticFields {

    static int staticField;
    int nonStaticField;

    public StaticFields(int nonStatF1, int nonStatF2) {
        staticField = nonStatF1;
        nonStaticField = nonStatF2;

        String text = "New Object created\n";
        text += "Static field "+ staticField +"\n";
        text += "Non static field "+ nonStaticField;
        System.out.println(text);
    }

    void show(){
        String text = "New Object created\n";
        text += "Static field "+ staticField +"\n";
        text += "Non static field "+ nonStaticField;
        System.out.println(text);
    }

    public static void main(String[] args) {

        StaticFields staticFields = new StaticFields(10,200);
        //changing value of static field
        //(using reference on the class)
        StaticFields.staticField = -10;
        staticFields.show();
        System.out.println("one more object creating:");
        StaticFields staticFields2 = new StaticFields(1,2);
        //by creating new obj, changing value of static field:
        staticFields.show(); //here we can see that
        staticFields2.staticField = -20;
        staticFields2.nonStaticField = -300;
        System.out.println("-----show obj1--------");
        staticFields.show();//we see changed static field again


    }


}
