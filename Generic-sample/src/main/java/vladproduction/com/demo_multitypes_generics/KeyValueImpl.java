package vladproduction.com.demo_multitypes_generics;

public class KeyValueImpl<K, V> implements KeyValue<K, V> {
    public static void main(String[] args) {
        //problem:
//        KeyValue<Integer, Double>[] pairs = new KeyValueImpl <Integer, Double> [5]; // error to create the array with parameters types

        //solution:
        // Create an array of KeyValue using the raw type and cast it
        KeyValue<Integer, Double>[] pairs = (KeyValue<Integer, Double>[]) new KeyValueImpl[5];

        // Example of how to populate the array with KeyValueImpl instances
        pairs[0] = new KeyValueImpl<>(1, 1.1);
        pairs[1] = new KeyValueImpl<>(2, 2.2);
        pairs[2] = new KeyValueImpl<>(3, 3.3);
        pairs[3] = new KeyValueImpl<>(4, 4.4);
        pairs[4] = new KeyValueImpl<>(5, 5.5);

        // Print the keys and values
        for (KeyValue<Integer, Double> pair : pairs) {
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }

        //------Upper case----
        KeyValue <? extends Number, ? > kv = new KeyValueImpl(12, 'k');
        kv = new KeyValueImpl(99, "bbb");
        kv = new KeyValueImpl (9.99, "bbb");
//        kv = new KeyValueImpl(int[], Long);// compile error - type must be Number or it`s subclass;

        //------Lower case----
        KeyValue <? super Integer, ? > kv2 = new KeyValueImpl(12, 'k');
        kv2 = new KeyValueImpl (99, "bbb");
        kv2 = new KeyValueImpl (9.99, "bbb");
//        kv2 = new KeyValueImpl(int[], Long); //compile error - type must be Integer, Number or Object

    }
    private K key;
    private V value;
    public KeyValueImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public V getValue() {
        return value;
    }
}
