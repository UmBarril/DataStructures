package stack;

public class LinkedStack<T> implements Stack<T> {
    private class Node<T> {
        Node<T> next;
        T value;
        public Node(T value) { this.value = value; }
    }
    private Node<T> top;
    private int size = 0;
    @Override
    public T peek() {
        return top.value;
    }

    @Override
    public boolean put(T e) {
        Node<T> newTop = new Node<>(e);
        newTop.next = top;
        top = newTop;
        size++;;
        return true;
    }

    @Override
    public T pop() {
        if(top == null) {
            return null;
        }
        Node<T> oldTop = top;
        top = oldTop.next;
        oldTop.next = null;
        size--;
        return oldTop.value;
    }

    @Override
    public int size() {
        return size;
    }
}
