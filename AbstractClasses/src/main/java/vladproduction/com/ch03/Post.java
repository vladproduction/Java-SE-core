package vladproduction.com.ch03;

public abstract class Post {

    void delivery(String a) {System.out.println("Delivery from: "+a);
    }

    void receive(String b) {System.out.println("Receive from: "+b);
    }

    void pay(int x) { System.out.println("Payment: "+x);
        massage();
    }

    public abstract void massage();

}
