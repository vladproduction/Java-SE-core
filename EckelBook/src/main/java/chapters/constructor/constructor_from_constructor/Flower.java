package chapters.constructor.constructor_from_constructor;

public class Flower {
    int petalCount = 0;
    String s = new String("null");

    Flower(int petals) {
        petalCount = petals;
        System.out.println(
                "Constructor w/ int arg only, petalCount= "
                        + petalCount);
    }

    Flower(String ss) {
        System.out.println(
                "Constructor w/ String arg only, s=" + ss);
        s = ss;
    }

    //combination:
    Flower(String s, int petals) {
        this(petals);
//!    this(s); // Нельзя вызвать два!
        this.s = s; // Другое использование "this"
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println(
                "default constructor (no args)");
    }

    void print() {
//!    this(11); // Не внутри - не конструктор!
        System.out.println(
                "petalCount = " + petalCount + " s = "+ s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }

    /*Конструктор Flower(String s, int petals) показывает, что когда вы вызываете один конструктор,
    используя this, вы не можете вызвать второй. Кроме того, вызов конструктора должен быть первой вещью,
    которую вы делаете, или вы получите сообщение об ошибке.

    Этот пример также показывает другой способ, которым вы можете использовать this. Так как имя аргумента s и
    имя члена-данного s совпадает, здесь может возникнуть некоторая двусмысленность. Чтобы разрешить ее, вы
    говорите this.s, чтобы указать на член-данное. Вы часто будете видеть эту форму использования в Java коде,
    и она используется в некоторых местах этой книги.

    В print( ) вы можете видеть, что компилятор не позволяет вам вызывать конструктор изнутри любого метода,
    отличного от конструктора.*/
}
