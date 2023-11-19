package vladproduction.com.example_singleton;

// Usage example
public class Main {
    public static void main(String[] args) {
        Singleton<String> singletonString = new Singleton<String>() {
            @Override
            protected String createInstance() {
                return "Singleton instance of String";
            }
        };

        String instanceString = singletonString.getInstance();
        System.out.println(instanceString); // Output: Singleton instance of String

        Singleton<Integer> singletonInteger = new Singleton<Integer>() {
            @Override
            protected Integer createInstance() {
                return 42;
            }
        };

        Integer instanceInteger = singletonInteger.getInstance();
        System.out.println(instanceInteger); // Output: 42
    }
}
