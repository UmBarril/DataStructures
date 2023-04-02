package stack;

public class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int stackEnd = 0;
    public ArrayStack(){
        this(10);
    }
    public ArrayStack(int initialSize){
        this.array = (T[])new Object[initialSize];
    }
    @Override
    public T peek() {
        if(size() < 1) {
            return null;
        }
        return array[stackEnd - 1];
    }

    @Override
    public boolean put(T e) {
        if(stackEnd > array.length)
            resizeArray(array.length * 2);
        array[stackEnd] = e;
        stackEnd++;
        return true;
    }

    @Override
    public T pop() {
        if(size() < 1) {
            return null;
        }
        if(size() < array.length / 4) {
            resizeArray(array.length / 2);
        }
        T temp = array[stackEnd - 1];
        array[stackEnd - 1] = null;
        stackEnd--;
        return temp;
    }

    @Override
    public int size() {
        return stackEnd;
    }

    private void resizeArray(int newSize) {
        T[] newArray = (T[])new Object[newSize];
        for (int i = 0; i < stackEnd; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
