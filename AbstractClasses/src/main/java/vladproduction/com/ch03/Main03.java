package vladproduction.com.ch03;

public class Main03 {
    public static void main(String[] args) {
        Post kievPost = new KievPost();
        kievPost.delivery("Kiev");
        kievPost.receive("Rome");
        kievPost.pay(200);

        Post ukrPost = new UkrPost();
        ukrPost.receive("Poltava");
        ukrPost.delivery("Dnipro");
        ukrPost.pay(250);

    }
}
