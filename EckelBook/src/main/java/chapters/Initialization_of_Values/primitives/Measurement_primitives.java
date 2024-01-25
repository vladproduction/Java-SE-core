package chapters.Initialization_of_Values.primitives;

public class Measurement_primitives {
    boolean aBoolean;
    char aChar;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;

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
        Measurement_primitives measurementPrimitives = new Measurement_primitives();
        measurementPrimitives.print();
    }
}
