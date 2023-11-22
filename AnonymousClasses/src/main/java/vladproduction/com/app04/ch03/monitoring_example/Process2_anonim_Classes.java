package Anonim_class.ch03.monitoring_example;

public class Process2_anonim_Classes {
    public static void main(String[] args) {
        Monitoring house = new Monitoring() {
            @Override
            public void start() {
                System.out.println("electric counter start");
                System.out.println("water counter start");
                System.out.println("thermometer monitoring start");
            }

            @Override
            public void finish() {
                System.out.println("electric counter finish");
                System.out.println("water counter finish");
                System.out.println("thermometer monitoring finish");
            }

            @Override
            public void result() {
                System.out.println("electric counter result");
                System.out.println("water counter result");
                System.out.println("thermometer monitoring result");
            }
        };
        house.start();
        house.finish();
        house.result();

        System.out.println("-------------");


    }
}
