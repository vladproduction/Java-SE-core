package vladproduction.com.code_blocks;

/**
 * default block is invoking every time when new object class is created
 * */
public class DefaultCodeBlock {
    public static void main(String[] args) {

        Bus bus1 = new Bus(11);
        Bus bus2 = new Bus(21);

        System.out.println(bus1);
        System.out.println(bus2);

        //create some Bus by default constructor:
        Bus bus3 = new Bus();
        Bus bus4 = new Bus();
        System.out.println(bus3);
        System.out.println(bus4);

    }
}

class Bus{

    private int id;

    {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append("default block # 1 (always before constructor) ");
        sb.append("id = ").append(id).append(" }");
        System.out.println(sb);
    }

    {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append("default block # 2 (always before constructor) ");
        sb.append("id = ").append(id = 1).append(" }");
        System.out.println(sb);
    }

    public Bus() {
        System.out.println("default constructor of the Bus class");
    }

    public Bus(int id) {
        System.out.println("parameterized constructor of the Buss class");
        System.out.println("id = " + id);
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[Bus ");
        sb.append("id: ");
        sb.append(id);
        sb.append("]");
        return sb.toString();
    }
}
