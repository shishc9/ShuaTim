import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/17, 20:30
 * @Auther:ShiShc
 */

public class MyTest {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void before() {
        lock.lock();

        try{
            System.out.println("before");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void after() {
        lock.lock();
        try {
            condition.await();
            System.out.println("after");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyTest myTest = new MyTest();
        executorService.execute(() -> myTest.after());
        executorService.execute(() -> myTest.before());
    }
}
