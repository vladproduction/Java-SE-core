package Anonim_class.InnerClass.auto_example;

public class Auto {
    String model;

    class Engine{
        private boolean working = false;
        public void work(){
            working = true;
            System.out.println("Engine working");
        }
    }
    Engine engine = new Engine();
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.model = "BMW";
        auto.engine.work();
    }

}

