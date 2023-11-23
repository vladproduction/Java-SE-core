
package Class_Methods.ch04;

import java.util.Date;

public class Main04 {
    public String s;
    public static void main(String[] args) {
        int value = storage("1");//2
         value = storage("10");//4
        System.out.println(value);//last compilation

        System.out.println("------------------");
        StaticTest st1 = new StaticTest();
        int value1 = st1.i;
        System.out.println("value1 = st1.i "+value1);//47

        System.out.println("------------------");
        StaticFun.incr(); // 47-??? but expected 48

        System.out.println("------------------");
        System.out.println("Hello, it's: ");
        System.out.println(new Date());

        System.out.println("------------------");
        Learning.tomorrow("yes");

    }
    static int storage (String s){
        return s.length()*2;
    }
    public static class StaticTest{
        static  int i = 47;
    }
    static class StaticFun{
        static void incr(){
            System.out.println(StaticTest.i++);
        }
    }

    static  class Learning{
        static String tomorrow(String x){
            if(x.contains("yes")){
                System.out.println("we contact at 10:00 AM");
            }else {
                System.out.println("let me know, when))");
            }
            return x;
        }
    }

}
