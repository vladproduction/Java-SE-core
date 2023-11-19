package vladproduction.com.app03;

public class Main04 {
    public static void main(String[] args) {

        String name = "test";
        String newName = name.replace("t", "T");
        printName(name);
        printName(newName);

        System.out.println("-------------");
        System.out.println(name.hashCode());
        System.out.println(newName.hashCode());
        System.out.println(name.equals(newName));


    }
    private static void printName(String a){
        System.out.println("name: " +  a);
    }

}
