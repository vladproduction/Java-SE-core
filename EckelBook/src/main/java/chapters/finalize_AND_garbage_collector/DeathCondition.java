package chapters.finalize_AND_garbage_collector;

public class DeathCondition {
    public static void main(String[] args) {

        Book novel = new Book(true);
        // Правильная очистка:
        novel.checkIn();
        // Бросаем ссылку, забываем очистить:
        new Book(true);
        // Форсируем сбор мусора и финализацию:
        System.gc();

    }

    static class Book {
        boolean checkedOut = false;

        public Book(boolean checkOut) {
            checkedOut = checkOut;
        }

        void checkIn() {
            checkedOut = false;
        }

        public void finalize() {
            if (checkedOut) {
                System.out.println("Error: checked out");
            }
        }
    }
}

        /*Состояние смерти состоит в том, что предполагается, что все объекты Book проверяются перед
        сборкой мусора, но в main( ) программист не выполняет ни один из объектов. Без finalize( ) с
        проверкой состояния смерти было бы трудно обнаружить ошибку.

        Обратите внимание, что System.gc( ) используется для форсирования финализации (и должно выполнятся
        во время разработке программы для ускорения отладки). Но даже если это не так, то есть высокая
        вероятность того, что блуждающий Book будет обязательно обнаружен при повторных запусках программы
        (имеется в виду, что программа занимает достаточно места, что является причиной запуска сборщика
        мусора).*/
