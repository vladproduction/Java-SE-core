package Reflection.app01;

public class Main {
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("Reflection.app01.Player");
            Object object = cl.newInstance();
            Player p1 = (Player) object;
            p1.doAction();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
