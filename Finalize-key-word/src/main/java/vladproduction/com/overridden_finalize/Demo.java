package vladproduction.com.overridden_finalize;

import java.lang.*;

public class Demo {

  protected void finalize() throws Throwable {
    try {
      System.out.println("Inside finalize method of Demo Class.");
    } 
    catch (Throwable e) {
      throw e;
    } 
    finally {
      System.out.println("Calling finalize method of the Object class");

      // Calling finalize() of Object class
      super.finalize();
    }
  }

  public static void main(String[] args) throws Throwable {
    // Creating demo's object
    Demo d = new Demo();

    // Calling finalize of demo
    d.finalize();
  }
}
