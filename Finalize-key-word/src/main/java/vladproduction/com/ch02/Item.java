package Finalize.ch02;

public class Item {

    private String title;
    private int price;

    public Item() {
        System.out.println("Constructor default");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            System.out.println("finalize()");


            System.out.println("finalize() done");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("----------------------");
            e.printStackTrace();
        }finally {
            super.finalize();
        }
    }
}
