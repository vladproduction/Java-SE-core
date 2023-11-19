package vladproduction.com.comparingStrings;

public class CompareStrings {
    public CompareStrings(){}
    public static void main (String[] args){

        String line1 = "This A";
        String line2 = "this a";

        System.out.println("line1: "+line1);
        System.out.println("line2: "+line2);
        System.out.println();

        System.out.println("\tall in lowerCase:");
        String lowerCaseLine1 = line1.toLowerCase();
        String lowerCaseLine2 = line2.toLowerCase();
        boolean b = lowerCaseLine1.equalsIgnoreCase(lowerCaseLine2);
        if (b) {
            System.out.println("line1 and line2 are case-insensitive");
            System.out.println(lowerCaseLine1.equals(lowerCaseLine2));
        } else {
            System.out.println("line1 and line2 are case-insensitive");
            System.out.println(lowerCaseLine1.equals(lowerCaseLine2));
        }

        System.out.println();

        if (lowerCaseLine1.equals(line1)) {
            System.out.println("line1 is all lowercase");
        } else {
            System.out.println("line1 is mixed case");
        }
        if (lowerCaseLine2.equals(line2)) {
            System.out.println("line2 is all lowercase");
        } else {
            System.out.println("line2 is mixed case");
        }
    }
}
