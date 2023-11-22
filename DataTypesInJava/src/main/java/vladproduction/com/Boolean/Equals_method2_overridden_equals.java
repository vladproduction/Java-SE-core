package Boolean;

public class Equals_method2_overridden_equals {
    public static void main(String[] args) {

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));

    }
    static class Value{
        int i;

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}
