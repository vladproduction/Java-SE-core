package chapters.control_Instructions.switch_case_selection_statement;

public class SwitchExample2 {
    public static void main(String[] args) {

        int num = 1;
        switch (num){
            case 0:
                System.out.println("number is '0';");
                break;
            case 1:
                System.out.println("number is '1';");
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("number is simple;");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("number is even;");
                break;
            default:
                System.out.println("number is '9' or out of bounds;");

        }
    }
}
