Continually executes a block of statements while a particular
condition is true. Its syntax can be expressed as:
 while (expression) {
 statement(s)…
 }
Evaluates expression, which must return a boolean value. If the
expression evaluates to true, the while statement executes the
statement(s) in the while block.

Continually executes a block of statements while a particular condition is true. Its syntax
can be expressed as:
class WhileDemo {
 public static void main(String[] args){
 int count = 1;
 while (count < 11) {
 System.out.println("Count is: " + count); count++;
 }
 }
}
You can implement an infinite loop using the while statement as follows:
 while (true){
 // your code goes here
 }

 do-while statement, which can be expressed as follows:
  do {
  statement(s) …
  } while (expression);
 The difference between do-while and while is that do-while
 evaluates its expression at the bottom of the loop instead of
 the top.

 while, do-while и for управляют циклом и иногда классифицируются как итерационные инструкции.
 Инструкция повторяется до тех пор, пока управляющее логическое выражение не станет ложным.
 Форма цикла while следующая:
        while(Логическое выражение)
            инструкция

 Логическое выражение вычисляется один раз в начале цикал, а затем каждый раз перед каждой будующей
 итерацией для интсрукции