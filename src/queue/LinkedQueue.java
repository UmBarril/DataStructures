package queue;

public class LinkedQueue<T> implements Queue<T> {
    private class Node<T> {
        Node<T> next;
        T value;
        public Node(T value) { this.value = value; }
    }
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    @Override
    public T peek() {
        return first.value;
    }

    @Override
    public T poll() {
        if(size < 1) {
            return null;
        }
        size--;
        Node<T> temp = first;
        first = first.next;
        if(first == null) {
            last = null;
        }
        return temp.value;
    }

    @Override
    public boolean add(T e) {
        size++;
        if(last == null) {
            first = new Node<>(e);
            last = first;
            return true;
        }
        last.next = new Node<>(e);
        last = last.next;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
}
