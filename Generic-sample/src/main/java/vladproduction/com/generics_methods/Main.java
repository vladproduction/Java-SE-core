package vladproduction.com.generics_methods;

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = Box.box("1"); // a box with String
        Box<Integer> box2 = new BoxProvider().box(2); // a box with Integer
        System.out.println(box1);//Box{value=1}
        System.out.println(box2);//Box{value=2}
    }
}

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public static <V> Box<V> box(V value) {
        return new Box(value);
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}

class BoxProvider {
    public <T> Box<T> box(T value) {
        return new Box(value);
    }
}

