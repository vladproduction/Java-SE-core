package chapters.constructor.overloadingConstructor;

public class Overload_method_parameters_order {
    public static void main(String[] args) {
        /*Два метода print( ) имеют идентичные аргументы, но порядок их следования различается.
        Это дает возможность различать их.*/
        print(100,"int first");
        print("String first",100);

    }
    static void print(int i, String s){
        System.out.println("int: "+i+" String: "+s);
    }

    static void print( String s,int i){
        System.out.println("String: "+s+" int: "+i);
    }
}
