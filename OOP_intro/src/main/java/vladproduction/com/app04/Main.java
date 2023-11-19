package vladproduction.com.app04;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Solly", "March", 23);
        System.out.println(person);

        Employee employee = new Employee("John", "Dow", 20,
                            123,555555,"supervisor");
        System.out.println(employee);

        Developer developer = new Developer("Adam","Block",26, 123123,
                4444, "it", "senior");
        System.out.println(developer);


    }
}
