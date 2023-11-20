package vladproduction.com.app01;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main02 {
    public static void main(String[] args) throws Exception {

        Properties properties = read();
        String data = properties.getProperty("data");
        String action = properties.getProperty("action");

        Class dataClass = Class.forName(data);
        Object object = dataClass.newInstance();

        Method[] methods = dataClass.getDeclaredMethods();
        //Method[] methods = dataClass.getMethods();
        Method actionMethod = null;
        for (Method m: methods) {
            String nameMethod = m.getName();
            System.out.println(nameMethod);
            if(nameMethod.equals(action)){
                actionMethod = m;
            }
        }
        if(actionMethod == null){
            System.out.println("action not found");
        }else {
//            Sportsmen sportsmen = new Sportsmen();
//            sportsmen.jump();
            actionMethod.invoke(object);
        }


    }
    private static Properties read(){
        Properties prop = new Properties();
        try(InputStream in = Main02.class.getResourceAsStream("/app.properties")){
            prop.load(in);
            return prop;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
