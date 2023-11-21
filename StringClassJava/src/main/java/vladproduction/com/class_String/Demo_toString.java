package vladproduction.class_String;

public class Demo_toString {
    public static void main(String[] args) {

        Box obj=new Box(10,20,30);
        String s="Attention! "+obj;
        System.out.println(s);
        System.out.println(obj);
    }

    static class Box{
        double width, height, depth;
        Box(double w,double h,double d){
            width=w; height=h; depth=d;}
        public String toString(){
            return "Volume: "+width+"/"+height+"/"+depth;}}

}
