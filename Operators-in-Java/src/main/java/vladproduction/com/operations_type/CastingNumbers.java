package vladproduction.com.operations_type;

public class CastingNumbers {


    /*Что делает приведение к char? То есть, если вы имеете значение 29.7 и вы приводите его к char,
    будет ли результирующее значение равно 30 или 29?*/
    public static void main(String[] args) {
        double
                above = 0.7,
                below = 0.4;
        System.out.println("above: " + above);
        System.out.println("below: " + below);
        System.out.println(
                "(int)above: " + (int)above);
        System.out.println(
                "(int)below: " + (int)below);
        System.out.println(
                "(char)('a' + above): " +
                        (char)('a' + above));
        System.out.println(
                "(char)('a' + below): " +
                        (char)('a' + below));
    }

    /*  above: 0.7
        below: 0.4
        (int)above: 0
        (int)below: 0
        (char)('a' + above): a
        (char)('a' + below): a     */

    //Так что ответ такой: приведение float или double к целому значению происходит простым обрезанием.

}
