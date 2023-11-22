package vladproduction.com.Clone.app01.problem;

public class MyPhone implements Cloneable{
    private int price;
    private String manufactory;
    private MyPhoneInfo myPhoneInfo;

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

    public MyPhoneInfo getMyPhoneInfo() {
        return myPhoneInfo;
    }

    public void setMyPhoneInfo(MyPhoneInfo myPhoneInfo) {
        this.myPhoneInfo = myPhoneInfo;
    }

    @Override
    public String toString() {
        return "MyPhone{" +
                "price=" + price +
                ", manufactory='" + manufactory + '\'' +
                ", myPhoneInfo=" + myPhoneInfo +
                '}';
    }

    @Override
    public MyPhone clone() throws CloneNotSupportedException {
        return (MyPhone) super.clone();
    }
}
