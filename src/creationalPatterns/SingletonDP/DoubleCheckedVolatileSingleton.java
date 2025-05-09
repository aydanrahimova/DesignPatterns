package creationalPatterns.SingletonDP;

public class DoubleCheckedVolatileSingleton {
    private volatile static DoubleCheckedVolatileSingleton instance;

    private DoubleCheckedVolatileSingleton() {
    }

    public static DoubleCheckedVolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedVolatileSingleton.class) {
                if (instance == null)
                    instance = new DoubleCheckedVolatileSingleton();
            }
        }
        return instance;
    }
}
