package queue;

public class ArrayQueue<T> implements Queue<T> {
    private T[] array;
    private int queueStart = 0;
    private int queueEnd = 0;
    public ArrayQueue() {
        this(10);
    }
    public ArrayQueue(int initialSize) {
        this.array = (T[]) new Object[initialSize];
    }
    @Override
    public T peek() {
        return array[queueStart];
    }

    @Override
    public T poll() {
        if(size() < array.length / 4) {
            pullArrayBackAndResize(array.length / 2);
        }
        if(queueStart >= queueEnd) {
            return null;
        }
        T temp = array[queueStart];
        array[queueStart] = null;
        queueStart++;
        return temp;
    }

    @Override
    public boolean add(T e) {
        if(array.length < queueEnd) {
            if(size() + 1 > array.length / 2)
                pullArrayBackAndResize(array.length * 2);
            else pullArrayBackAndResize(array.length);
        }
        array[queueEnd] = e;
        queueEnd++;
        return true;
    }

    @Override
    public int size() {
        return queueEnd - queueStart;
    }

    private void pullArrayBackAndResize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        int size = size();
        for (int i = 0; i < size; i++) {
            newArray[i] = array[queueStart + i];
        }
        array = newArray;
        queueEnd = size;
        queueStart = 0;
    }
}
