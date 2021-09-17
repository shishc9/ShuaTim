import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/8, 17:21
 * @Auther:ShiShc
 */

public class CountDownLatchExample {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void test() {
        lock.lock();
        try {
            condition.await();
            System.out.println("waken");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch cdL = new CountDownLatch(totalThread);
        CountDownLatchExample countDownLatchExample = new CountDownLatchExample();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0;i < totalThread; ++i) {
            executorService.execute(
                    () -> {
                        System.out.println("run --");
                        cdL.countDown();
                    }
            );
        }
        countDownLatchExample.test();
        cdL.await();
        System.out.println("end");
        executorService.shutdown();
    }
}
