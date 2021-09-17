import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/8, 21:20
 * @Auther:ShiShc
 */

public class SemaphoreExample {
    public static void main(String[] args) {
        final int client = 5;
        final int totalRequestCount = 10;
        Semaphore semaphore = new Semaphore(client);
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0;i < totalRequestCount; ++i) {
            executorService.execute(
                    () -> {
                        try {
                            semaphore.acquire();
                            System.out.println(semaphore.availablePermits() + " ");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } finally {
                            semaphore.release();
                        }
                    }
            );
        }

        executorService.shutdown();
    }
}
