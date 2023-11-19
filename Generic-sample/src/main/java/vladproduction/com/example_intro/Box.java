package vladproduction.com.example_intro;

public class Box<T> {
    private T contents;

    public void setContents(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContents("Hello, World!");
        String contents = stringBox.getContents();
        System.out.println(contents);
    }
}
