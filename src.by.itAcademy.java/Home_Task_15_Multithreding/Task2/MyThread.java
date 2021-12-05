package Home_Task_15_Multithreding.Task2;

import java.util.Random;import java.util.Random;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        int max = 0;
        Random random = new Random();
        System.out.println(getName());
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Максимальное значение " + max);
        System.out.println();
    }
}
