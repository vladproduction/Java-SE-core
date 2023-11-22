package vladproduction.com.Clone.app01.solution;

public class MyPhoneSolution {
    private int price;
    private String manufactory;
    private MyPhoneSolutionInfo myPhoneInfo;

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

    public MyPhoneSolutionInfo getMyPhoneInfo() {
        return myPhoneInfo;
    }

    public void setMyPhoneInfo(MyPhoneSolutionInfo myPhoneInfo) {
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
    public MyPhoneSolution clone()  {
        MyPhoneSolution copy = new MyPhoneSolution();
        copy.setPrice(this.price);
        copy.setManufactory(manufactory);

        String currentColor = myPhoneInfo.getColor();
        int currentSize = myPhoneInfo.getSize();
        MyPhoneSolutionInfo copyInfo = new MyPhoneSolutionInfo();
        copyInfo.setColor(currentColor);
        copyInfo.setSize(currentSize);

        copy.setMyPhoneInfo(copyInfo);

        return copy;
    }
}
