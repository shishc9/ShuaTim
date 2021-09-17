public class ThreadLocalExample {
    public static void main(String[] args) {
        System.out.println("ThreadLocalExample ClassLoader is " + ThreadLocalExample.class.getClassLoader());
        System.out.println("The parent ClassLoader is " + ThreadLocalExample.class.getClassLoader().getParent());
        System.out.println("The grandParent Classloader is " + ThreadLocalExample.class.getClassLoader().getParent().getParent());
    }
}
