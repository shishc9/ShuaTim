import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/25, 14:02
 * @Auther:ShiShc
 */

public class MyCallable implements Callable<Integer> {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();

        System.out.println(ft.get());
    }

    @Override
    public Integer call() {
        return 123;
    }
}
