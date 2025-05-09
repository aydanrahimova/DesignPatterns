package creationalPatterns.SingletonDP;

// This approach is similar to the lazy initialization singleton and is thread-safe.
// However, it has a performance drawback because every thread must enter the synchronized method,
// even if the instance has already been created.

public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton instance;

    public synchronized static ThreadSafeSingleton getInstance() {
        if (instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }
}
