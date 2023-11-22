package Boxing_Unboxing.app02;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 10;
        // b++;
        List<Integer> integerList = new ArrayList<Integer>();
        //Collections.List<int> integerList2 = new ArrayList<int>(); --> no avail
        integerList.add(a);
        integerList.add(b);

        for (int i = 0; i < integerList.size(); i++) {
            int value = integerList.get(i);
            System.out.println(i+"="+value);
        }
        System.out.println("--------------------");
        for (Integer value: integerList){
            System.out.println(value);
        }
        System.out.println("--------------------");
        for (int value: integerList){
            System.out.println(value);
        }
    }
}
