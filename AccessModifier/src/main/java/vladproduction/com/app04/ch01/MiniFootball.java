package vladproduction.com.app04.ch01;


import vladproduction.com.app04.Football;

public class MiniFootball extends Football {
    @Override
    protected void rulesFootball() {
        System.out.println("playing by futsal rules");
    }

    public void ballSize(){
        System.out.println("Size of ball for miniFootball is: ");
    }

    void ballSize(int a){
        System.out.println(a);
    }


}
