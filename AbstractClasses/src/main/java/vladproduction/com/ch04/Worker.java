package vladproduction.com.ch04;

public abstract class Worker {

    public void doWork(){
        System.out.println("doWork() START");
        greeting();
        System.out.println("doWork() FINISH");
    }

    public abstract void greeting();
}
