package datastructs.list;

public class ArrayList<T> implements List<T> {
    private T[] array;
    private int lastElementPosition;
    public ArrayList() {
        this(10);
    }
    public ArrayList(int size) {
        this.lastElementPosition = 0;
        this.array = (T[])new Object[size];
    }
    @Override
    public void add(T element) {
        if(lastElementPosition + 1 >= array.length) {
            resizeArray(array.length * 2);
        }
        array[lastElementPosition] = element;
        lastElementPosition++;
    }
    public T pop() {
        return remove(lastElementPosition);
    }
    @Override
    public T get(int index) {
        return this.array[index];
    }
    @Override
    public T remove(int index) {
        if(index > lastElementPosition || index < 0) {
            throw new InvalidIndexException(index);
        }
        if(index == lastElementPosition) {
            lastElementPosition--;
            if(lastElementPosition < array.length / 4) {
                resizeArray(array.length / 2);
            }
        }
        T temp = array[index];
        array[index] = null;
        return temp;
    }
    @Override
    public int size() {
        return this.lastElementPosition;
    }

    private void resizeArray(int newSize) {
        T[] temp = (T[])new Object[newSize];
        for(int i = 0; i <= lastElementPosition; i++) {
            temp[i] = array[i];
        }
        this.array = temp;
    }
}
