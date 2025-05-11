package creationalPatterns.SingletonDP;
//provide example with reflection

/**
 * Eager Singleton Pattern:
 * - The instance is created at the time of class loading (eager initialization).
 * - Thread-safe by nature since instance is created before any thread accesses it.
 * - Not memory-efficient if the instance is never used.
 */
public class EagerSingleton {

    private EagerSingleton() {
        if (EagerSingleton.instance != null) {
            // Prevents creation of another instance using reflection
            throw new InstantiationError("This object creation is not allowed");
        }
    }

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
