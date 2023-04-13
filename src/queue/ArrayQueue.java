package queue;

public class ArrayQueue<T> implements Queue<T> {
    private T[] array;
    private int size = 0;
    private int head = 0;
    private int tail = 0;
    public ArrayQueue() {
        this(10);
    }
    public ArrayQueue(int initialSize) {
        this.array = (T[]) new Object[initialSize];
    }
    @Override
    public T peek() {
        return array[head];
    }

    @Override
    public T poll() {
        if(size < 1) return null;
        if(size > 0 && size < array.length / 4) {
            resize(array.length / 2);
        }
        if(head == array.length) {
            head = 0;
        }
        T temp = array[head];
        array[head] = null;
        head++;
        size--;
        return temp;
    }

    @Override
    public void add(T e) {
        if(tail == array.length) {
            tail = 0;
        }
        if(size == array.length) {
            resize(array.length * 2);
        }
        array[tail] = e;
        tail++;
        size++;
        return true;
    }

    private void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        int nextInOldArray = head;
        for (int i = 0; i < size; i++) {
            nextInOldArray += i;
            if(nextInOldArray == size - 1) {
                nextInOldArray = 0;
            }
            newArray[i] = array[nextInOldArray];
        }
        array = newArray;
        tail = size;
        head = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
