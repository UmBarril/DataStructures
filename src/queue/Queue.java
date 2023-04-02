package queue;

public interface Queue<T> {
    // TODO: add comments
    T peek();
    T poll();
    boolean add(T e);
    int size();
}
