package Home_Task_9_OOP;

public class Application {
    public static void main(String[] args) {
        Engineers engineer = new Engineers("Sergei","engineer-electronic",186,3);
        Employees engineer1 = new Engineers("Andrei","engineer-electronic",180,3);
        engineer.leadWorkers();
        engineer1.work();

        Managers manager1= new Managers("Директор","Alexandr",168,5,20);
        manager1.getSalary();
        System.out.println(manager1.getSalary());


    }
}
