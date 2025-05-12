package com.vladproduction.app35.java_parameter_passing;

public class ObjectAsParam {
    public static void main(String[] args) {

        Player playerValue = new Player("Original", 10);
        System.out.println(playerValue);//Player{name='Neymar', number=10}
        System.out.println(playerValue.hashCode());//1096979270

        doActionAsReference(playerValue);//make some actions
        System.out.println(playerValue);//Player{name='Updated by doActionAsReference', number=10} hashCode:1096979270

        doActionForObject(playerValue);

        System.out.println("\nCheck if we can see any changes in the original object:");
        System.out.println(playerValue);

        System.out.println("\n=====Person actions=====");
        Person person = new Person("Alice");
        System.out.println("Before: " + person.name); // Output: Before: Alice

        // Pass the object to the method
        modifyName(person);
        System.out.println("After modifyName: " + person.name); // Output: After modifyName: Bob

        changeReference(person);
        System.out.println("After changeReference: " + person.name); // Output: After changeReference: Bob
    }

    private static void doActionAsReference(Player playerReference){
        //Player playerReference = playerValue;
        System.out.println(playerReference.hashCode());
        playerReference.setName("Updated");
    }

    private static void doActionForObject(Player playerReference){
        playerReference = new Player();
        System.out.println(playerReference.hashCode());//new hash since we created a new object: 1078694789
        playerReference.setName("NewObject");
    }

    public static void modifyName(Person p) {
        p.name = "Bob"; // Mutates the object by changing a field
    }

    public static void changeReference(Person p) {
        p = new Person("Charlie"); // This changes the local reference, not the original object
    }

    //model class
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    //model class
    static class Player {

        private String name;
        private int number;

        public Player(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public Player() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return String.format("Player{name='%s', number=%d}", name, number);
        }
    }

}
