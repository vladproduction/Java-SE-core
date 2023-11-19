package vladproduction.com.app10;

public class Database {
    private double url;
    private static Database instance = null;

    public Database() {
        System.out.println("const start:");
        if(instance != null){
            System.out.println(instance.url);
        }else {
            this.url = Math.random();
            instance = this;
            System.out.println(instance.url);
        }
        System.out.println("const finish!");
    }

    @Override
    public String toString() {
        return "" + url;
    }
}
