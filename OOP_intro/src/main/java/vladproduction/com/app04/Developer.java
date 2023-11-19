package vladproduction.com.app04;

public class Developer extends Employee{

    private String level;

    public Developer(String firstName, String lastName, int age, int inn, int phoneNumb, String role, String level) {
        super(firstName, lastName, age, inn, phoneNumb, role);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "level='" + level + '\'' +
                "} " + super.toString();
    }
}
