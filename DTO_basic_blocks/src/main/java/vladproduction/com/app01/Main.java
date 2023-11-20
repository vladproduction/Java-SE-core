package vladproduction.com.app01;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", 29);
        ClassImm classImm = new ClassImm(person);
        System.out.println(classImm);
        Person person2 = classImm.getPerson();
        System.out.println(person2);
        //person2.setAge(30); //after we define final for Person it comes as immutable - 1 version
        person2.setAge(30); //version -2 for person who are not immutable
        System.out.println(classImm); //original
        System.out.println(person2);//new set for clone
        System.out.println();
        System.out.println("hash person: " + person.hashCode());
        System.out.println("hash person2: " + person2.hashCode());

        System.out.println("equal: " + person.equals(person2));

        System.out.println(person == person2);

    }
}
