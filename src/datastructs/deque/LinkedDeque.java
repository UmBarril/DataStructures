package datastructs.deque;

public class LinkedDeque<T> implements Deque<T>  {
    private class Node<T> {
        Node<T> next;
        Node<T> previous;
        T value;
        public Node(T value) { this.value = value; }
    }
    @Override
    public T poll() {
        return null;
    }

    @Override
    public void add(T e) {

    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean put(T e) {
        return false;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
    // TODO
}
