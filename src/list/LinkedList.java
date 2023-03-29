package list;

class Node<T> {
    Node<T> next;
    T value;

    public Node(T value) {
        this.value = value;
    }
}

public class LinkedList<T> implements List<T> {
    private int length;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public boolean add(T element) {
        if(tail == null) {
            head = new Node<>(element);
            tail = head;
            length++;
            return true;
        }
        tail.next = new Node<>(element);
        tail = tail.next;
        length++;
        return true;
    }

    @Override
    public T remove(int index) {
        if(index == 0) {
            T temp = head.value;
            head = head.next;
            length--;
            return temp;
        }
        Node<T> previous = head;
        Node<T> current = previous;
        for(int i = 1; i <= index; i++) {
            current = previous.next;
            previous = current;
        }
        if(index == length - 1) {
            previous.next = null;
        } else previous.next = current.next;
        length--;
        return current.value;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public T pop() {
        return remove(length - 1);
    }

    @Override
    public T get(int index) {
        Node<T> current = head;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current.value;
    }
    // TODO
}
