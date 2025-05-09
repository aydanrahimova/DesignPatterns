package creationalPatterns.SingletonDP;

// The reason we need double-checked locking is as follows:
// Suppose we have two threads that both check the first condition at the same time,
// and both see that the instance is null (condition is true).
// The first thread enters the synchronized block and creates the instance.
// Without a second check inside the synchronized block, the second thread would also enter
// and create a new instance — because its initial check also saw that the instance was null.
// The second check prevents this from happening.
// But this approach also has negative side-which is discussed in DoubleCheckedVolatileSingleton

public class DoubleCheckedSingleton {
    private static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null)
                    instance = new DoubleCheckedSingleton();
            }
        }
        return instance;
    }
}
