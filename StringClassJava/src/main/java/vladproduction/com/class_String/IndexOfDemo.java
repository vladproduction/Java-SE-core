package vladproduction.class_String;

public class IndexOfDemo {
    public static void main(String[] args) {
        IndexOfDemo indexOfDemo = new IndexOfDemo();
        indexOfDemo.run();
    }

    private void run() {

        String s = "Bridges are crucial links that carry cars, " +
                "trucks and trains across bodies of water, mountain gorges or other roads.";
        System.out.println(s);
        System.out.println("1: "+s.indexOf('c'));
        System.out.println("2: "+s.lastIndexOf('d'));
        System.out.println("3: "+s.indexOf("cars"));
        System.out.println("4: "+s.indexOf(',',37));
        System.out.println("5: "+s.indexOf(".",10));

    }
}
