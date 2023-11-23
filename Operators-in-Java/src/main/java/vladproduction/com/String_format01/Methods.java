package vladproduction.com.String_format01;

public class Methods {
    public void add1(int a, int b){
        System.out.println(String.format("add1(int+int); a=%s,b=%s",a,b));
        int c = a+b;
        System.out.println("c= "+c);
    }
    public void add2(String a, String b){
        System.out.println(String.format("add2(String+String); a=%s,b=%s",a,b));
        String c = a+b;
        System.out.println("c: "+c);
    }
    public void add3(int a, String b){
        System.out.println(String.format("add3(int+String)--->String into int; a=%s,b=%s",a,b));
        int newb = Integer.parseInt(b);
        int c = a+newb;
        System.out.println("c="+c);

    }
    public void add4(int a, String b){
        System.out.println(String.format("add4(int+String)--->int into String; a=%s,b=%s",a,b));
        String newa = a+"";
        String c = newa+b;
        System.out.println("c="+c);

    }
    public void minus1(int a, int b){
        System.out.println(String.format("minus1(int-int); a=%s,b=%s",a,b));
        System.out.println("rez="+(a-b));
    }
    public void minus2(String a, String b){
        System.out.println(String.format("minus2(String-String)--->rez into int; a=%s,b=%s",a,b));
        int newA = Integer.parseInt(a);
        int newB = Integer.parseInt(b);
        System.out.println("rez="+(newA-newB));
    }
    public void minus3(int a, int b){
        System.out.println(String.format("minus3(int-int)--->rez in String; a=%s,b=%s",a,b));
        System.out.println("rez= "+((a-b)+""));
        //it`s the same thing, but more writing
        //int c = a-b;
        //String newc = c+"";
        //System.out.println("rez= "+newc);
    }
    public void minus4(String a,String b){
        System.out.println(String.format("minus4(String-String)--->rez in String;a=%s,b=%s",a,b));
        int newa = Integer.parseInt(a);
        int newb = Integer.parseInt(b);
        System.out.println("rez= "+((newa-newb)+""));
    }

    public String plus1(int a, int b){
        System.out.println("addAsText(); a="+a+"; b="+b);
        int sum = a+b;
        String res = sum+"";
        return res;

    }

    public String plus2(int a, int b){
        System.out.println("addAsText2(); a="+a+"; b="+b);
        return a+b+"";
    }


}
