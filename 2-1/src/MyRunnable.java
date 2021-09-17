import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/25, 13:58
 * @Auther:ShiShc
 */

public class MyRunnable implements Runnable{

    private static int num = 1;


    @Override
    public void run() {
        System.out.println("MyThread" + num);
        num ++;
    }

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();


        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0;i < 5;i ++) {
            executorService.execute(new MyRunnable());
        }

        executorService.shutdown();
    }
}
