package Finalize.ch02;

import java.util.ArrayList;
import java.util.List;

public class Finalize_Lesson {
    public static void main(String[] args) {
        //no warranty it will run and compile
        //slower work when overridden

        long start = System.currentTimeMillis();
        List<Finalize_Lesson> list = new ArrayList();
        for (int i=0;i<1000000;i++){
            list.add(new Finalize_Lesson());
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    //for 1 000 000 objects when no finalize currentTimeMillis = 100
    //for 1 000 000 objects when overridden finalize currentTimeMillis = 1760 -->slower run

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    //but sometimes we can use super.finalize();- in case to protect
    //from other users our code, who want`s enter of code hierarchy;
    //should be in block finally { } --> super.finalize(); as locker!
//      try{
//        doing smth
//    }finally{
//        super.finalize();
//    }

}
