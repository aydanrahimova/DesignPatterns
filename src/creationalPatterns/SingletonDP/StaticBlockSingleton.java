package creationalPatterns.SingletonDP;

//this approach is similar to EagerSingletonPattern,but it provides exception handling

public class StaticBlockSingleton {
    private StaticBlockSingleton() {
    }

    private static final StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception is thrown while creating an instance...");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
