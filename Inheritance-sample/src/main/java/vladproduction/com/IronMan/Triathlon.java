package vladproduction.com.IronMan;

public class Triathlon {
    String nameDist;
    double swim;
    int bike;
    double run;
    String division;

    public void distance(String nameDist,double swim,int bike,double run){
        System.out.println("Distance Information:");
        System.out.println(String.format("%s,swim=%s,bike=%s,run=%s",nameDist,swim,bike,run));
    }

    public void rating(String division){
        System.out.println("Rating inform:"+division);
    }

    public void scoring(String division, String nameDist){
        System.out.println("Division: "+division);
        System.out.println("Distance: "+nameDist);

    }
}
