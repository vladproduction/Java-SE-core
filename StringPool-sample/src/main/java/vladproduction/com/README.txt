Strings are a sequence of characters.
Strings are objects.
String class provide different methods and Constructors for a correct manipulation of String objects.
•Creating Strings.
•Concatenating Strings

String : -Serializable;-Comparable;-charSequence (implements);

1)What is string pooling in Java?
  As the name suggests, String Pool in java is a pool of Strings stored in Java Heap Memory.
  We know that String is a special class in java and we can create String objects using a new operator
   as well as providing values in double-quotes.

2)Пул строк (String Pool) — это множество строк в кучи (Java Heap Memory). Мы знаем, что
String — особый класс в java, с помощью которого мы можем создавать строковые объекты.
 Сам строковый пул возможен только потому, что строки в Java неизменные. Также пул строк
 позволяет сохранить память в Java Runtime, хотя это и требует больше времени на создание самой строки.

   Пример работы с пулом строк:
   Когда мы используем двойные кавычки, чтобы создать новую строку, то первым делом идет поиск
   строки с таким же значением в пуле строк. Если java такую строку нашла, то возвращает ссылку,
   в противном случае создается новая строка в пуле, а затем возвращается ссылка.

   Однако использование оператора new заставляет класс String создать новый объект String.
   После этого можем использовать метод intern(), чтобы поместить этот объект в пул строк или
   обратиться к другому объекту из пула строк, который имеет такое же значение.

   Ниже приведена программа, которая демонстрирует работу с пулом строк:

       public static void main(String[] args) {
           String s1 = "Cat";
           String s2 = "Cat";
           String s3 = new String("Cat");
           // сравниваем наши строки
           System.out.println("s1 == s2 : " + ( s1 == s2 ) );
           System.out.println("s1 == s3 : " + ( s1 == s3 ) );
       }
       Результат выполнения программы:
          s1 == s2 : true
          s1 == s3 : false

       public static void main(String[] args) {
           String s1 = "Cat";
           String s2 = "Cat";
           String s3 = new String("Cat");
           // сравниваем наши строки
           System.out.println("s1 == s2 : " + ( s1 == s2 ) );
           System.out.println("s1 == s3 : " + ( s1 == s3 ) );
       }
  Результат выполнения программы:
   s1 == s2 : true
   s1 == s3 : false
