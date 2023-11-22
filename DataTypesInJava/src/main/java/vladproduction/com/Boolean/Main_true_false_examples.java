package Boolean;

public class Main_true_false_examples {
    //boolean has two values: "true" and "false"
    //result of () is inside Java language
    //() not count; [] count; about massive
    // && work as logic "AND"; two conditions must be done for TRUE   -->one false-all false
    // || work as "OR"; work when minimum of one of conditions is done-->one true-all true
    // == means definitely(exactly)
    // if (true){code block} --> if false code don`t work
    // if (true){code block}else{code block #2} --> if false code#2 work

    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1+";"+flag2);

        boolean isBigger = 10<15;
        System.out.println("isBigger="+isBigger);

        boolean isLess = 10 < 15;
        System.out.println("isLess=" + isLess);

        int value = 10;
        boolean isInside = -5<value&&value<20;
        System.out.println("isInside="+isInside);

        System.out.println("--------------------------");
        boolean c1 = -5<value;
        boolean c2 = value<5;
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        //all conditions should be done
        boolean andValue = c1 && c2;
        System.out.println("andValue="+andValue);
        //at least 1 condition should be done
        boolean orValue = c1 || c2;
        System.out.println("orValue="+orValue);

        System.out.println("------------==--------------");
        int t = 80;
        boolean isEqual = (t==10);
        System.out.println("isEqual="+isEqual);
        System.out.println("t="+t);

        System.out.println("------------<=--------------");
        int r = 6;
        boolean isLessOrEqual = r<=5;
        System.out.println("isLessOrEqual="+isLessOrEqual);
        System.out.println("r="+r);

        System.out.println("------------>=--------------");
        int e = 110;
        boolean isBiggerOrEqual = e>=10;
        System.out.println("isBiggerOrEqual="+isBiggerOrEqual);
        System.out.println("e="+e);

        System.out.println("----------IF(true)----------------");
        int age = 55;
        boolean isAdult = age >=18;
        if(isAdult){
            System.out.println("Take your beer!!!");
        }

        System.out.println("----------IF(false)----------------");
        int price = 1000;
        boolean isCheap = price<=10;
        if(!isCheap){
            System.out.println("We buy some not cheep goods!!!");
        }

        System.out.println("----------if(true) else----------------");
        int height = 180;
        boolean isToll = height > 175;
        if(isToll){
            System.out.println("You need to play basketball");
        } else {
            System.out.println("you are short!!!");
        }

    }

}
