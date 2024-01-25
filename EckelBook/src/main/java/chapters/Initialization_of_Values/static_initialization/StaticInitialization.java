package chapters.Initialization_of_Values.static_initialization;

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println(
                "Creating new Cupboard() in main");
        new Cupboard();
        System.out.println(
                "Creating new Cupboard() in main");
        new Cupboard();
        t2.function2(1);
        t3.function3(1);
    }
    static Table t2 = new Table();
    static Cupboard t3 = new Cupboard();
}
    //Порядок инициализации таков: сначала инициализируются static, если они ранее не были
    // инициализированы при создании предыдущего объекта, а затем инициализируются не static
    // объекты. Вы ясно можете видеть в результатах работы программы.
