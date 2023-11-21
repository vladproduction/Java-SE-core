package vladproduction.class_StringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Мы программируем на С++");
        System.out.println("length() = "+str.length());
        System.out.println("capacity() = "+str.capacity());
        str.insert(20,"Java и ");
        System.out.println(str);
        str.replace(27,30,"Pascal");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
