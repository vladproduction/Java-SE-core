package vladproduction.com.different_scenarious.call_once_for_object;

public class Data {

  public static void main(String[] args) {
    Data obj = new Data();
    obj = null;
    System.gc();
    System.out.println("Running garbage collector by gc() method");

    System.gc();
    System.out.println("Again try to run garbage collector by gc() method");
  }

  @Override
  // overriding method
  protected void finalize() {
    System.out.println("Finalize method is called");
  }
}
