package Home_Task_9_OOP;

public class Application {
    public static void main(String[] args) {
        Engineers engineer = new Engineers();
        Workers worker = new Workers();
        Managers manager = new Managers();

        Employees engineer1 = new Engineers();
        Employees worker1 = new Workers();
        engineer1.work();
        worker1.work();

    }
}
