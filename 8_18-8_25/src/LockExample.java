import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockExample {

    public void func() {
        try {
            for(int i = 0;i < 10;i ++) {
                System.out.println(i);
            }
        } finally {

        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> lockExample.func());
        executorService.execute(() -> lockExample.func());
    }
}
