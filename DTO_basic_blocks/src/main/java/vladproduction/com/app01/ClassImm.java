package vladproduction.com.app01;

public final class ClassImm {

    private final Person person;

    public ClassImm(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        Person clone = new Person();
        clone.setName(person.getName());
        clone.setAge(person.getAge());
        return clone;
    }

    @Override
    public String toString() {
        return "ClassImm{" +
                "person=" + person +
                '}';
    }
}
