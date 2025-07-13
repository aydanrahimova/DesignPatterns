package behavioralPatterns.IteratorDP;

public class MyCollectionIterator<T> implements MyIterator<T> {
    private T[] items;
    private int position = 0;

    public MyCollectionIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public T next() {
        return items[position++];
    }
}
