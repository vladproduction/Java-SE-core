package vladproduction.com.Clone.app01.problem;

public class MyPhoneInfo {
    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TvInfo{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
