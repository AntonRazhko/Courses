package Home_Task_17_Multithreading_sinchronized;

public class MyThread extends Thread {
    Object object;

    public MyThread(Object object) {
        this.object = object;
    }

    @Override
    public synchronized void run() {
        synchronized (object) {
            System.out.println(currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
