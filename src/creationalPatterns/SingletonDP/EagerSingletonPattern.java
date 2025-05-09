package creationalPatterns.SingletonDP;

//that is not memory efficient because we may not use the singleton object but it will be created when class loaded
//but this approach is thread safe

public class EagerSingletonPattern {
    private EagerSingletonPattern() {
        if (EagerSingletonPattern.instance != null) {
            //we should define it for preventing creation of new instance by the use of reflection
            throw new InstantiationError("This object creation not allowed");
        }
    }

    private static final EagerSingletonPattern instance = new EagerSingletonPattern();

    public static EagerSingletonPattern getInstance() {
        return instance;
    }
}
