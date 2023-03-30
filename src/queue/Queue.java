package queue;

public interface Queue<T> {
    // TODO: add comments
    T peek();
    T poll();
    T add();
    T remove();
}
