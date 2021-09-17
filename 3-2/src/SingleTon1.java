/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 15:08
 * @Auther:ShiShc
 */

class SingleTon2 {
    private static SingleTon2 singleTon2;
    private SingleTon2() {}

    public static synchronized SingleTon2 getInstance() {
        if(singleTon2 == null) return singleTon2 = new SingleTon2();
        return singleTon2;
    }
}

class SingleTon3 {
    private static SingleTon3 singleTon3 = new SingleTon3();
    private SingleTon3() {}

    public static SingleTon3 getInstance() {return singleTon3;}
}

class SingleTon4 {
    private static SingleTon4 singleTon4;
    private SingleTon4() {}

    public static SingleTon4 getInstance() {
        if(singleTon4 == null) {
            synchronized (SingleTon4.class) {
                if(singleTon4 == null) {
                    singleTon4 = new SingleTon4();
                }
            }
        }
        return singleTon4;
    }
}



public class SingleTon1 {

    private static SingleTon1 singleTon1;

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        if(singleTon1 == null) singleTon1 = new SingleTon1();
        return singleTon1;
    }
}
