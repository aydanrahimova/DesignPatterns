package creationalPatterns.SingletonDP;

//this approach is not thread safe
// but in difference with eager and static block singleton this approach is memory efficient

public class LazySingletonPattern {
    private LazySingletonPattern() {
    }

    private static LazySingletonPattern instance;

    public static LazySingletonPattern getInstance() {
        if (instance == null)
            instance = new LazySingletonPattern();
        return instance;
    }
}
