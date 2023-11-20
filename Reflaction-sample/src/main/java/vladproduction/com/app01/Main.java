package vladproduction.com.app01;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person p = new Person("John", 22);
        Class<?> aClass = Class.forName("vladproduction.com.app01.Person");
        Object obj1 = aClass.newInstance();
        Person p1 = (Person) obj1;

        Object obj2 = aClass.newInstance();
        Person p2 = (Person) obj2;
    }
}
