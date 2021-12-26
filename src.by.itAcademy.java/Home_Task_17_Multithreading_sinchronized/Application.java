package Home_Task_17_Multithreading_sinchronized;

public class Application {
    public static void main(String[] args) {
        Object object = new Object();
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread(object);
            thread.start();
        }
    }
}
