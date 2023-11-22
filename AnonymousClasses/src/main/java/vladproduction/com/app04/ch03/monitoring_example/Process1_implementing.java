package Anonim_class.ch03.monitoring_example;

public class Process1_implementing {
    public static void main(String[] args) {
        Monitoring houseE = new Electric();
        Monitoring houseW = new Water();
        Monitoring houseT = new Temp();

        houseE.start();
        houseW.start();
        houseT.start();

        houseE.finish();
        houseW.finish();
        houseT.finish();

        houseE.result();
        houseW.result();
        houseT.result();


    }
}
