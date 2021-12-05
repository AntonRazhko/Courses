package Home_Task_15_Multithreding.Task2;

public class Application {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Поток №1");
        myThread1.setPriority(1);
        MyThread myThread2 = new MyThread( "Поток №2");
        MyThread myThread3 = new MyThread( "Поток №3");
        MyThread myThread4 = new MyThread( "Поток №4");
        MyThread myThread5 = new MyThread( "Поток №5");
        MyThread myThread6 = new MyThread( "Поток №6");
        MyThread myThread7 = new MyThread( "Поток №7");
        MyThread myThread8 = new MyThread( "Поток №8");
        MyThread myThread9 = new MyThread( "Поток №9");
        MyThread myThread10 = new MyThread( "Поток №10");
        myThread10.setPriority(10);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
    }
}

