package vladproduction.com.ch02;

public class Main02 {
    public static void main(String[] args) {
        Track track = new Track();
        track.typeEngine(); //steel has from parent, but no app to override in child's classes
        track.amountWheels();
    }
}
