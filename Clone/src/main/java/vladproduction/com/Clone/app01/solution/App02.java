package vladproduction.com.Clone.app01.solution;



public class App02 {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyPhoneSolution a = new MyPhoneSolution();
        a.setPrice(1);
        a.setManufactory("LG");
        MyPhoneSolutionInfo info = new MyPhoneSolutionInfo();
        info.setColor("White");
        info.setSize(10);
        a.setMyPhoneInfo(info);
        System.out.println("a="+a);

        System.out.println("--------clone-----");
        //no problems
        MyPhoneSolution b = a.clone();
        System.out.println("b="+b);
        System.out.println("a.hash="+a.hashCode());
        System.out.println("b.hash="+b.hashCode());
        //problem
        MyPhoneSolutionInfo bInfo = b.getMyPhoneInfo();
        MyPhoneSolutionInfo aInfo = a.getMyPhoneInfo();
        System.out.println("bInfo.hash="+bInfo.hashCode());
        System.out.println("aInfo.hash="+aInfo.hashCode());

        System.out.println("----------update Color for b-----------");
        bInfo.setColor("RED");
        System.out.println("b="+b);
        System.out.println("a="+a);

    }
}

