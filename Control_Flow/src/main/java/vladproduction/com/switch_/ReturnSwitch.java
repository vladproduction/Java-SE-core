package vladproduction.com.switch_;

public class ReturnSwitch {
    public static void main(String[] args) {
        System.out.println(defineLevel("admin")); //3
    }
    private static int defineLevel(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = "+ role);
                yield -1;
            }
        };
    }
}
