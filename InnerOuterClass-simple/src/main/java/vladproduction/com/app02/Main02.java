package vladproduction.com.app02;

public class Main02 {

    public static void main(String[] args) {

        Phone phone = new Phone();

        Audi object = new Audi() {
            private boolean isWork;

            public void isDrive() {
                this.isWork = true;
            }

            public void printInfo() {
                System.out.println(isWork);
            }
        };

        object.printInfo();  //false
        object.isDrive();  //set true
        object.printInfo();  //true

    }

    private static class Audi {
        public void printInfo() {

        }

        public void isDrive() {

        }
    }
}
