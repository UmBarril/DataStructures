package datastructs.stack;

public interface Stack<T> {
    // TODO: add comments
    T peek();
    boolean put(T e);
    T pop();
    int size();
}
