import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/3, 18:27
 * @Auther:ShiShc
 * 关于设置线程池大小：
 * 如果是CPU密集型任务，就需要尽量压榨CPU，参考值可以设为Ncpu+1。
 * 如果是IO密集型任务，可以设为2*Ncpu。
 */

public class ThreadPoolTest {
    public static void main(String[] args) {
        /**
         * 在Java doc中，并不提倡直接使用ThreadPoolExecutor，而是使用Executors类中提供的几个静态方法来创建线程池：
         * Executors.newCachedThreadPool();
         * Executors.newSingleThreadExecutor();
         * Executors.newFixedThreadPool(int);
         */
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5)
        );

        for(int i = 0; i < 15; i ++) {
            MyTask t = new MyTask(i);
            executor.execute(t);
            System.out.println("ThreadPoolNum : " + executor.getPoolSize() + ", QueueNum : " + executor.getQueue().size()
             + ", CompletedNum : " + executor.getCompletedTaskCount());
        }

        executor.shutdown();
    }
}

class MyTask implements Runnable {

    private int TaskNum;

    MyTask(int num) {
        this.TaskNum = num;
    }

    @Override
    public void run() {
        System.out.println("Running Task " + TaskNum);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Task " + TaskNum + "over!");
    }
}
