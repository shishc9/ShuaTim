import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/8, 16:30
 * @Auther:ShiShc
 */

public class MySynchronized {

    void func1() {
        synchronized (this) {
            for(int i = 0; i < 10; ++ i) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        MySynchronized ms1 = new MySynchronized();
        MySynchronized ms2 = new MySynchronized();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> ms1.func1());
        executorService.execute(() -> ms2.func1());
    }
}
