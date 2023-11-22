package Boolean;

public class Equals_method {
    public static void main(String[] args) {

        /*Что если сравнить реальное содержимое объектов на равентсво? Мы должны использовать специальный
    метод equals( ), который существует для всех объектов (не для примитивов, которые
    отлично работают с == и !=).*/
        Integer n1 = new Integer(1000);
        Integer n2 = new Integer(1000);
        System.out.println(n1.equals(n2));  //true
        System.out.println(n2.equals(n1));  //true

        /*Результат - false. Это происходит потому, что поведение по умолчанию equals( ) - это
        сравнение ссылок. Так что, если не перегрузить equals( ) в вашем новом классе,
        мы не получим описанное поведение.*/
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2)); //false , because equals() is overridden
    }



    static class Value{
        int i;

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}

