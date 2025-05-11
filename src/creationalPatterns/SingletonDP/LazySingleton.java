package creationalPatterns.SingletonDP;
//provide example with cloning

/**
 * Lazy Singleton Pattern:
 * - The instance is created only when it's first needed (lazy initialization).
 * - Not thread-safe: if multiple threads call getInstance() simultaneously, multiple instances may be created.
 * - More memory efficient than Eager or Static Block Singleton because the object is not created unless required.
 */
public class LazySingleton implements Cloneable {
    private LazySingleton() {
    }

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }

    // Clone method that breaks the singleton pattern (should be overridden to prevent cloning)
    @Override
    public LazySingleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning a singleton is not allowed");
    }
}
