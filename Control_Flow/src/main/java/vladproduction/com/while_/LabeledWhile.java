package vladproduction.com.while_;

public class LabeledWhile {

    public static void main(String[] args) {
        int i = 0;
        outer:
        while(true) {
            prt("Outer while loop");
            while(true) {
                i++;
                prt("i = " + i);
                if(i == 1) {
                    prt("continue");
                    continue;
                }
                if(i == 3) {
                    prt("continue outer");
                    continue outer;
                }
                if(i == 5) {
                    prt("break");
                    break;
                }
                if(i == 7) {
                    prt("break outer");
                    break outer;
                }
            }
        }
    }
    static void prt(String s) {
        System.out.println(s);
    }

    /*
    Те же правила применимы для while:
        Обычный continue переводит в начало самого внутреннего цикла и продолжает выполнение.
        Помеченный continue переходит к метке и вновь входит в цикл, расположенный сразу за этой меткой.
        break “выбрасывает в низ” цикла.
        Помеченный break выбрасывает в низ после конца цикла, у которого объявлена метка.*/
}
