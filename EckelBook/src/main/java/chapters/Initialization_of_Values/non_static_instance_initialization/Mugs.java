package chapters.Initialization_of_Values.non_static_instance_initialization;

public class Mugs {
    Mug c1;
    Mug c2;
    {
        c1 = new Mug(1);
        c2 = new Mug(2);
        System.out.println("c1 & c2 initialized");
    }
    Mugs() {
        System.out.println("Mugs()");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Mugs x = new Mugs();
    }
    /*выглядит точно так же, как и предложение статической инициализации, за исключением
    отсутствия ключевого слова static. Этот синтаксис необходим для поддержки инициализации
    анонимного внутреннего класса */
}
