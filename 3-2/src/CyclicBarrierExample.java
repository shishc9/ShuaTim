import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/8, 20:30
 * @Auther:ShiShc
 */

public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int totalThread = 10;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0;i < totalThread; ++ i) {
            executorService.execute(
                    () -> {
                        System.out.println("before..");
                        try {
                            cyclicBarrier.await();
                        } catch (InterruptedException | BrokenBarrierException e) {
                            e.printStackTrace();
                        }
                        System.out.println("after..");
                    }
            );
        }

        executorService.shutdown();

    }
}
