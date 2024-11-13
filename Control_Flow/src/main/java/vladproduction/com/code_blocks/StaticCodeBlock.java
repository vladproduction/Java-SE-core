package vladproduction.com.code_blocks;

/**
 * static block is invoking only one time when we access to the static class members or static methods
 * */
public class StaticCodeBlock {
    public static void main(String[] args) {
        Person person1 = new Person(200);
        Person person2 = new Person(300);
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("------ *** default constructor *** ------");
        Person person3 = new Person();
        Person person4 = new Person();
        System.out.println(person3);
        System.out.println(person4);

    }
}

class Person{
    private int id;
    static int counter = 100;
    {
        StringBuilder sb = new StringBuilder("{ default block-1 ");
        sb.append("id = ").append(id).append(" }");
        System.out.println(sb);
    }
    {
        StringBuilder sb = new StringBuilder("{ default block-2 (assign id) ");
        sb.append("id = ").append(id = 1).append(" counter is modified by static block: ").append(counter).append(" }");
        System.out.println(sb);
    }
    static {
        StringBuilder sb = new StringBuilder("{ static block executed first --> ");
        sb.append(" (working with static fields and methods of the class) ").append("counter = ").append(++counter).append(" }");
        System.out.println(sb);
    }

    public Person(int id) {
        this.id = id;
    }

    public Person() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[Person ");
        sb.append("id = ").append(id);
        sb.append("]");
        return sb.toString();
    }
}
