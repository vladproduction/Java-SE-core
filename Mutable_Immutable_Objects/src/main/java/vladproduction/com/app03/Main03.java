package vladproduction.com.app03;

public class Main03 {
    public static void main(String[] args) {

        String name = "baeldung";
        String newName = name.replace("dung", "----");

        assertEquals("baeldung", name);
        assertEquals("bael----", newName);
        assertEquals(name, newName);
    }

    private static void assertEquals(String a, String b) {
        if (a.equals(b)) System.out.println(true);

        if (a == b) System.out.println(true);

        if (a.hashCode() == b.hashCode()) System.out.println(true);
    }
}
