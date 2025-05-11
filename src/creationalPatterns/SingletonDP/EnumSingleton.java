package creationalPatterns.SingletonDP;

/**
 * Enum Singleton Pattern:
 * - Thread-safe by default (guaranteed by JVM).
 * - Protects against reflection and serialization issues.
 * - Instance is created during class loading (eager initialization),
 *   which may be inefficient if the instance is never used.
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("Method of Enum singleton with value");
    }

}
