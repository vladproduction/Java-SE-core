package vladproduction.com.app03;

import java.util.Arrays;
import java.util.Iterator;

public class Main03 {
    public static void main(String[] args) {

        User user = new User("John", "123");
        user.printInfoUser();
        System.out.println();
        User user2 = new User("John2", "1234");
        user2.printInfoUser();

        System.out.println("------Database--------");
        Database db = new Database("1", 2, "Jack", "1111");
        Object[] table = {1, 2, 3};
        Object[] tables = db.createNewTable(table);
        System.out.println(Arrays.toString(tables));


    }
}
