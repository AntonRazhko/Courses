package Home_Task_18_Threads_ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Application {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pullThread = Executors.newFixedThreadPool(3);
        Callable<String> callable = new MyCallable();

        List<Future<String>> result =new ArrayList<>(10);
        for (int i=0;i<10 ;i++){
            Future<String> submit = pullThread.submit(callable);
            result.add(submit);
        }
        for (Future<String> i: result) {
            System.out.println(i.get());
        }
        pullThread.shutdown();

    }
}
