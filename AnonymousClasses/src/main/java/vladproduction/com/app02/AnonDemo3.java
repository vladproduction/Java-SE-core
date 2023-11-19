package vladproduction.com.app02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonDemo3 {

    public static void main(String args[]) {

        // создать ArrayList и добавить в него
        // несколько объектов Integer

        List list = new ArrayList();
        list.add(37);
        list.add(-59);
        list.add(83);

        // отсортировать список обычным способом (по возрастанию)

        Collections.sort(list);
        System.out.println(list);

        // отсортировать список по убыванию,
        // используя функцию, реализованную объектом
        // при помощи анонимного класса

        list.sort((o1, o2) -> {
            int a = (Integer) o1;
            int b = (Integer) o2;
            return Integer.compare(b, a);
        });
        System.out.println(list);
    }
}
