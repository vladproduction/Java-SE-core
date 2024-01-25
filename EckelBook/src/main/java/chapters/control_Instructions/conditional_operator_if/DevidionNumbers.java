package chapters.control_Instructions.conditional_operator_if;

public class DevidionNumbers {
    public static void main(String[] args) {
        System.out.println("------simple if statement:----------");
        double x, y;
        x = 25.0;
        y = 5.0;
        if(y!=0){
            double rez = x/y;
            System.out.println("rez = "+rez);
        }

        System.out.println("------complex if statement:----------");
        int q, w;
        q = 100;
        w = 10;
        if(w!=0){
            System.out.println("operation aloud");
            int rez = q/w;
            System.out.println("rez = "+rez);
        }if(w<0){
            System.out.println("operation not aloud");
            int rez2 = q/w;
            System.out.println("rez2 = "+rez2);
        }
        else if (w>1000) {
            System.out.println("w number is too big");
            int rez3 = q/w;
            System.out.println("rez3 = "+rez3);
        }
        else if (w<10) {
            System.out.println("w number is less then '10'");
            int rez4 = q/w;
            System.out.println("rez4 = "+rez4);
        }
    }
}
