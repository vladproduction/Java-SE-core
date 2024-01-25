package chapters.control_Instructions.for_loop_statement;

public class CountNumbers {
    public static void main(String[] args) {

        //different types for initialisation in block:

        //1-------------------------------------
        int count1 = 10, i, s = 0;
        for (i = 1;i<=count1; i++){
            s+=i;
        }
        System.out.println("numbers in 'count1': "+count1+" = "+s);

        //2-------------------------------------
        int count2=10,i2,s2;
        for(i2=1,s2=0;i2<=count2;i2++){
            s2+=i2;}
        System.out.println("numbers in 'count2': "+count2+" = "+s2);


        //3-------------------------------------
        int count3 = 10,i3,s3;
        for(i3=1,s3=0;i3<=count3;s3+=i3,i3++);
        System.out.println("numbers in 'count3': "+count3+" = "+s3);


        //4-------------------------------------
        int count4 = 10,s4=0;
        for(int i4=1;i4<=count4;s4+=i4++);
        System.out.println("numbers in 'count4': "+count4+" = "+s4);

        //5-------------------------------------
        int count5 = 10,i5=0,s5=0;
        for(;i5<count5;s5+=i5){
            i5++;}
        System.out.println("numbers in 'count5': "+count5+" = "+s5);

        //6-------------------------------------
        int count6 = 10,i6=1,s6=0;
        for(;i6<=count6;){
            s6+=i6;
            i6++;}
        System.out.println("numbers in 'count6': "+count6+" = "+s6);

        //7-------------------------------------
        int count7 = 10,i7=0,s7=0;
        for(;;){
            s7+=++i7;
            if(i7>=count7) break;}
        System.out.println("numbers in 'count7': "+count7+" = "+s7);
    }
}
