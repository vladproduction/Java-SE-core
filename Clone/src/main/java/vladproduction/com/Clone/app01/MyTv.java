package vladproduction.com.Clone.app01;

public class MyTv implements Cloneable {
    private int price;
    private String manufactory;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    @Override
    public String toString() {
        return "MyTv{" +
                "price=" + price +
                ", manufactory='" + manufactory + '\'' +
                '}';
    }

    //deep clone
    @Override
    public MyTv clone() throws CloneNotSupportedException {
        MyTv item = new MyTv();
        item.setPrice(price);
        item.setManufactory(manufactory);
        return item;
    }

    //shadow clone
//    public MyTv clone() throws CloneNotSupportedException {
//        return (MyTv) super.clone();
//    }
}
