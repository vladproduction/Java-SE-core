package Boolean;

public class ShortCircuit {

    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        if(test1(0) && test2(2) && test3(2))
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
    }

    /*Первый тест возвращает в результате true, так что продолжается вычисление выражения.
    Однако второй тест в результате возвращает false. Так как это означает, что все выражение
    должно быть false, то зачем продолжать вычисления оставшегося выражения? Это было бы слишком
    дорого. Оправдание короткого замыкания, фактически, заключается именно в этом; вы можете
    получить потенциальное увеличение производительности, если не будет необходимости вычислять
    все части логического выражения.*/
}
