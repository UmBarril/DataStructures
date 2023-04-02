import list.ArrayList;
import list.LinkedList;
import list.List;
import stack.ArrayStack;
import stack.Stack;

public class Tests {
    public static void main(String[] args) {
//        List<String> al = new ArrayList<>();
//        TestList(al);
//        List<String> ll = new LinkedList<>();
//        TestList(ll);
        Stack<Integer> as = new ArrayStack<>();
        TestStack(as);
    }
    public static void TestDeque() { }
    public static void TestStack(Stack<Integer> stack) {
        stack.put(1);
        stack.put(2);
        stack.put(3);
        stack.put(4);
        stack.put(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    public static void TestTree() { }
    public static void TestQueue() { }
    public static void TestList(List<String> list) {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.pop();
        list.remove(10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
