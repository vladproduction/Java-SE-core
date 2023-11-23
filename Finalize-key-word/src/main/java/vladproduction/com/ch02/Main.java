package Finalize.ch02;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.setTitle("Item");
        item.setPrice(2000);
        System.out.println(item);
        System.out.println("------------");

        //item=null;
        System.gc();

    }
}
