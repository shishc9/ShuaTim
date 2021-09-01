public class SingleTon {
    private volatile static SingleTon singleTon;
    private SingleTon() {}

    public synchronized static SingleTon getSingleTon() {
        if(singleTon == null) {
            synchronized (SingleTon.class) {
                if(singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }

        return singleTon;
    }
}
