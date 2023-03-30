package list;

public class InvalidIndexException extends ArrayIndexOutOfBoundsException {
    public InvalidIndexException(int index) { super("Invalid index: " + index); }
}
