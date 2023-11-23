package vladproduction.com.String_format02;

public class App {

    public static void main(String[] args) {
        System.out.println("-----App start------");
        MyCalculator denisCalculator = new MyCalculator();
        int x = 5;
        int y = 7;
        denisCalculator.add(y, x);
        System.out.println("-------------------");
        denisCalculator.add(1, 2);
        System.out.println("-------------------");
        denisCalculator.add(10, y);
        System.out.println("-------------------");
        String i = "1";
        String j = "2";
        //compilation error
        //denisCalculator.add(i, j);
        denisCalculator.add2(i, j);
        System.out.println("---------String to int---------");
        //text has no arith operations
        //i=i*10;

        int res = Integer.parseInt(i);
        System.out.println("res="+res);
        res = res*20;
        System.out.println("res="+res);
        System.out.println("---------int to String---------");
        String textRes = res+"";
        System.out.println("resText="+textRes);
        //compilation error
        //textRes = textRes*5;
        System.out.println("------------String.format------------");
        denisCalculator.add3(4,5);
        System.out.println("------------String.format 2------------");
        denisCalculator.add4(4,5);
        System.out.println("----------------------");
        int w = Integer.parseInt("123");
        System.out.println("w="+w);
        int w2 = Integer.parseInt("25");
        System.out.println("w2="+w2);
        int t = 25;
        //String textT = "sdfsdgsgsgsgs"+25;
        String textT = 25+"sdfsdgsgsgsgs";
        System.out.println("----------------pitfall-----------");
        int n = 3;
        int m = 2;
        String text1 = n+m+"denis"+3+7;
        String text2 = "denis"+n*m;
        //() has priority--> we can use arithmetic operation (+-*/)
        //String text3 = "denis"+(n*m);
        System.out.println("text1="+text1);
        System.out.println("text2="+text2);
        //System.out.println("text3="+text3);


    }

}
