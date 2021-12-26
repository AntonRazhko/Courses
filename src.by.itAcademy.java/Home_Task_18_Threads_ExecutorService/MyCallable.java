package Home_Task_18_Threads_ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        List<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        Thread.sleep(3000);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        return Integer.toString(sum) + " " + Thread.currentThread().getName();
    }
}

