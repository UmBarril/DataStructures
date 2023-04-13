package queue;

public interface Queue<T> {
    // TODO: add comments
    T peek();
    T poll();
    void add(T e);
    int size();
}
