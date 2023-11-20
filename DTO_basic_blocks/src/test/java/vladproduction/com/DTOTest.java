package vladproduction.com;


import org.junit.Test;
import vladproduction.com.model.BadExampleLogin;
import vladproduction.com.model.Login;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class DTOTest {

    @Test
    public void positiveTrue(){

        //Part-1
        System.out.println("=====Part-1=====");
        Login login1 = new Login();
        login1.setUsername("John");
        login1.setPass("pass");
        login1.setId(10);

        Login login2 = new Login();
        login2.setUsername("John");
        login2.setPass("pass");
        login2.setId(10);

        if (login1 == login2){
            System.out.println("objects are '=='");
        }
        if (login1.equals(login2)){
            System.out.println("objects are 'equals'");
        }
        //Equals override test block
        assertEquals(login1, login2); //test passed

        //if we change something for object we are expecting negative result of test, so assertNotEquals:
        login2.setUsername("Jack");
        assertNotEquals(login1, login2); //test passed


        //Part - 2
        System.out.println("=====Part-2=====");
        String statusValue1 = "SUCCESS";
        String statusValue2 = "FAILED";

        Map<Login, String> loginAndStatus = new HashMap<>();
        login2.setUsername("John");
        loginAndStatus.put(login1, statusValue1);
        loginAndStatus.put(login2, statusValue2);
        System.out.println("Map.size(): " + loginAndStatus.size());
        System.out.println("hash login1 = " + login1.hashCode());
        System.out.println("hash login2 = " + login2.hashCode());

        assertEquals(statusValue2, loginAndStatus.get(login1));

        System.out.println("statusValue(expected): " + statusValue2);
        System.out.println("Value from Map: " + loginAndStatus.get(login1));

        //Part - 3
        System.out.println("=====Part-3=====");
        //not overridden equals and hashCode
        BadExampleLogin badLog1 = new BadExampleLogin();
        badLog1.name = "AAA";
        badLog1.pass = "bbb";
        badLog1.number = 20L;

        BadExampleLogin badLog2 = new BadExampleLogin();
        badLog2.name = "AAA";
        badLog2.pass = "bbb";
        badLog2.number = 20L;

        Map<BadExampleLogin, String> badExampleMap = new HashMap<>();
        badExampleMap.put(badLog1, statusValue1);
        badExampleMap.put(badLog2, statusValue2);
        System.out.println("Map<BadExampleLogin> size(): " + badExampleMap.size());
        System.out.println("badLog1.hash = " + badLog1.hashCode());
        System.out.println("badLog2.hash = " + badLog2.hashCode());


        assertNotEquals(statusValue2, badExampleMap.get(badLog1));
        assertEquals(statusValue1, badExampleMap.get(badLog1));
    }
}
