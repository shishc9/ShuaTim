

public class Main {
    public static int f() {
        int i = 0;
        try {
            return i++;
        } finally {
            ++ i;
        }
    }
    public static void main(String[] args) {
        int a = 0x7fffffff;
        int b = 1;
        int c = a + b;
        long d = a + b;
        int e = (int) a + b;
        long f = (long) a + b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}