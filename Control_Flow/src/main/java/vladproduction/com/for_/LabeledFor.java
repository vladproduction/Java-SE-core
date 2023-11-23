package vladproduction.com.for_;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer: // Здесь не может быть инструкций
        for(; true ;) { // бесконечный цикл
            inner: // Здесь не может быть инструкций
            for(; i < 10; i++) {
                prt("i = " + i);
                if(i == 2) {
                    prt("continue");
                    continue;
                }
                if(i == 3) {
                    prt("break");
                    i++; // В противном случае i никогда
                    // не получит инкремент.
                    break;
                }
                if(i == 7) {
                    prt("continue outer");
                    i++; // В противном случае i никогда
                    // не получит инкремент.
                    continue outer;
                }
                if(i == 8) {
                    prt("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++) {
                    if(k == 3) {
                        prt("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Здесь нельзя использовать break или continue
        // с меткой
    }
    static void prt(String s) {
        System.out.println(s);
    }

    /*Если не использовать инструкцию break outer, то нет способа выйти во внешний цикл из внутреннего
    цикла, так как break сам по себе прерывает только самый внутренний цикл. (То же самое верно
    и для continue.)

    Конечно, в случае, когда нужно прервать цикл и одновременно выйти из метода, вы можете просто
    использовать return.*/
}
