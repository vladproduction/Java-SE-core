package vladproduction.com.for_;

public class MainDemo01 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Loop; i="+i);
        }

        System.out.println("-----------Create array-------------");
        //array
        String[] names = new String[3];
        names[0] = "Denys";
        names[1] = "Vlad";
        names[2] = "Sergey";

        System.out.println("-----------read array-------------");
        System.out.println("0="+names[0]);
        System.out.println("1="+names[1]);
        System.out.println("2="+names[2]);
        //System.out.println("3="+names[3]);

        System.out.println("---------------------------------");
        int n = names.length;
        //n=3
        for(int i=0; i<n; i++){
            System.out.println(i+"="+names[i]);
        }
        System.out.println("----for completed-----");

        //System.out.println("//////////////////////////////////////////////////");
        //        int n = args.length;
//        System.out.println("n="+n);
//        for(int i=0;i<n;i++){
//            System.out.println(i+"="+args[i]);
//        }
        //System.out.println("//////////////////////////////////////////////////");


    }
}
