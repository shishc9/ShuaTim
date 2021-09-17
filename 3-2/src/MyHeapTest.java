/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/22, 21:30
 * @Auther:ShiShc
 */


// OOM :   -Xms1m -Xmx8m -XX:+HeapDumpOutOfMemoryError
    // DUMP堆内存溢出的情况
    // -Xms:初始化大小 -Xmx:最大大小
    // -XX:+PrintGCDetails
    // -XX:+HeapDumpOutOfMemoryError

    // Runtime类 : JVM调优
public class MyHeapTest {
    public static void main(String[] args) {
        long total = Runtime.getRuntime().totalMemory();
        long max = Runtime.getRuntime().maxMemory();

        System.out.println("total : " + total + " About " + total/(double)(1024*1024));
        System.out.println("max : " + max + " About " + max/(double)(1024*1024));
    }
}
