package vladproduction.com.example_singleton;

public class Singleton<T> {
    private T instance;

    Singleton() {
        // Private constructor to prevent instantiation
    }

    public synchronized T getInstance() {
        if (instance == null) {
            instance = createInstance();
        }
        return instance;
    }

    protected T createInstance() {
        // Logic for creating the instance
        return null;
    }
}

