import list.*;
import queue.ArrayQueue;
import queue.LinkedQueue;
import queue.Queue;
import stack.*;

public class Tests {
    public static void main(String[] args) {
//        List<String> al = new ArrayList<>();
//        TestList(al);
//        List<String> ll = new LinkedList<>();
//        TestList(ll);
//        Stack<Integer> as = new ArrayStack<>();
//        TestStack(as);
//        Stack<Integer> ls = new LinkedStack<>();
//        TestStack(ls);
//        Queue<Integer> aq = new ArrayQueue<>();
//        TestQueue(aq);
        Queue<Integer> lq = new LinkedQueue<>();
        TestQueue(lq);

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
    public static void TestQueue(Queue<Integer> queue) {
        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(6);
//        queue.add(5);
//        queue.add(5);
//        queue.add(5);
//        queue.add(5);
//        queue.add(5);
        System.out.println(queue.poll());
        queue.add(1);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
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
