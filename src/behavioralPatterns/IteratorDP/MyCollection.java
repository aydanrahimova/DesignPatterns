package behavioralPatterns.IteratorDP;
public class MyCollection<T> {
    private T[] items;
    private int index = 0;

    public MyCollection(int size) {
        items = (T[]) new Object[size];
    }

    public void add(T item) {
        if (index < items.length) {
            items[index++] = item;
        }
    }

    public MyIterator<T> iterator() {
        return new MyCollectionIterator<>(items);
    }
}
