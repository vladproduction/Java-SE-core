package vladproduction.com.MathOps;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создает генератор случайных чисел,
        // принимающий текущее время по умолчанию:
        Random random = new Random();
        int i, j, k;

        // '%' ограничивает максимальное значение величиной 99:
        j=random.nextInt() % 100;
        k=random.nextInt() % 100;

        MathOps mathOps = new MathOps();
        mathOps.printInt("j ",j);
        mathOps.printInt("k ",k);

        i=j+k; mathOps.printInt("j+k",i);
        i=j-k; mathOps.printInt("j-k",i);
        i=k/j; mathOps.printInt("k/j",i);
        i=k*j; mathOps.printInt("k*j",i);
        i=k%j; mathOps.printInt("k%j",i);
        j%=k;  mathOps.printInt("j%=k",j);
        System.out.println("---");

        // Проверка чисел с плавающей точкой:
        float u,v,w;  // Также применима к числам двойной точности
        v= random.nextFloat();
        w= random.nextFloat();
        mathOps.printFloat("v",v);
        mathOps.printFloat("w",w);
        u=v+w; mathOps.printFloat("v+w",u);
        u=v-w; mathOps.printFloat("v-w",u);
        u=v*w; mathOps.printFloat("v*w",u);
        u=v/w; mathOps.printFloat("v/w",u);

        System.out.println("---");
        // следующее также работает для
        // char, byte, short, int, long,
        // и double:
        u+=v; mathOps.printFloat("u+=v",u);
        u-=v; mathOps.printFloat("u-=v",u);
        u*=v; mathOps.printFloat("u*=v",u);
        u/=v; mathOps.printFloat("u/=v",u);

    }
}
