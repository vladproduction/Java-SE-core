package vladproduction.com.code_blocks;

public class StaticBlock_StaticFinalVariable {
    public static void main(String[] args) {

        Phone phone1 = new Phone(777);
        System.out.println(phone1);

        System.out.println("======");


        Phone phone2 = new Phone();
        System.out.println(phone2);

    }
}

class Phone{

    private static final int DEFAULT_NUMBER;

    private int custom_number;

    static {
        DEFAULT_NUMBER = Integer.parseInt("100");
        System.out.println(DEFAULT_NUMBER);
    }

    {
        custom_number = 100;
    }

    public Phone(int custom_number) {
        this.custom_number = custom_number;
    }

    public Phone() {
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[Phone ");
        sb.append(" DEFAULT_NUMBER: ").append(DEFAULT_NUMBER).append("; custom_number: ").append(custom_number).append(" ]");
        return sb.toString();
    }
}
