package creationalPatterns.SingletonDP;

public enum EnumSingletonPattern {

    INSTANCE;

    private int value;

    public void doSomething() {
        System.out.println(value);
    }

}
