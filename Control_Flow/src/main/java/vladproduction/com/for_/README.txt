The for statement provides a compact way to iterate over a range of
values.
 for (initialization; termination; increment) {
 statement(s)
 }
● The initialization expression initializes the loop; it's executed once, as
the loop begins.
● When the termination expression evaluates to false, the loop
terminates.
● The increment expression is invoked after each iteration through the
loop.

class ForDemo {
 public static void main(String[] args){
 for(int i=1; i<11; i++){
 System.out.println("Count is: " + i);
 }
 }
}
The output of this program is:
Count is: 1
Count is: 2
…
Count is: 10

Цикл for выполняет инициализацию перед первой итерацией. Затем он выполняет сравнение, а в конце каждой
итерации выполняется, некоторого рода, “шагание”. Форма цикла for следующая:
        for(инициализация; логическое выражение; шаг)
            инструкция
Любое из выражений: инициализация, логическое выражение или шаг, может быть пустым. Выражение проверяется
перед каждой итерацией, и как только при вычислении получится false, выполнение продолжится со строкиЮ
следующей за инструкцией for. В конце каждого цикла выполняется шаг.

Цикл for обычно используется для задач “подсчета”