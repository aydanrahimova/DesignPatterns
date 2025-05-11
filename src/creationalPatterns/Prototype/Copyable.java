package creationalPatterns.Prototype;

public interface Copyable {
    Object deepCopy();

    Object shallowCopy();
}
