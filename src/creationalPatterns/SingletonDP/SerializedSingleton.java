package creationalPatterns.SingletonDP;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    @Serial
    private static final long serialVersionUID = -2020L;

    private SerializedSingleton() {
    }

    public static SerializedSingleton instance = new SerializedSingleton();

    // Without this method while deserialization new object will be created
    // which will break the singleton pattern
    @Serial
    protected Object readResolve() {
        return instance;
    }
}
