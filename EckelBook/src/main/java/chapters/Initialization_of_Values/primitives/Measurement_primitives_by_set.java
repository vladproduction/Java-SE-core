package chapters.Initialization_of_Values.primitives;

public class Measurement_primitives_by_set {
    boolean aBoolean = true;
    char aChar = 'n';
    byte aByte = 47;
    short aShort = 0xff;
    int anInt = 25;
    long aLong = 1;
    float aFloat = 3.14f;
    double aDouble = 3.14159;

    void print(){
        System.out.println("" +
                "Data type   Initial value\n"+
                "boolean        " + aBoolean + "\n" +
                "char           [" + aChar + "] "+ (int)aChar +"\n"+
                "byte           " + aByte + "\n" +
                "short          " + aShort + "\n" +
                "int            " + anInt + "\n" +
                "long           " + aLong + "\n" +
                "float          " + aFloat + "\n" +
                "double         " + aDouble);
    }

    public static void main(String[] args) {
        Measurement_primitives_by_set measurementPrimitives = new Measurement_primitives_by_set();
        measurementPrimitives.print();
    }
}
