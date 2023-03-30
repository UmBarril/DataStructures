package stack;

import java.util.Deque;

public interface Stack<T> {
    T peek();
    boolean put(T e);
    T pop();
    // TODO
}
