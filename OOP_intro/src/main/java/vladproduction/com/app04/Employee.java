package vladproduction.com.app04;

public class Employee extends Person{

    private int inn;
    private int phoneNumb;
    private String role;

    public Employee(String firstName, String lastName, int age, int inn, int phoneNumb, String role) {
        super(firstName, lastName, age);
        this.inn = inn;
        this.phoneNumb = phoneNumb;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "inn=" + inn +
                ", phoneNumb=" + phoneNumb +
                ", role='" + role + '\'' +
                "} " + super.toString();
    }
}
