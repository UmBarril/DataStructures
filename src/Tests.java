import list.ArrayList;
import list.LinkedList;
import list.List;

public class Tests {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        TestList(al);
        List<String> ll = new LinkedList<>();
        TestList(ll);
    }
    public static void TestDeque() { }
    public static void TestStack() { }
    public static void TestTree() { }
    public static void TestQueue() { }
    public static void TestList(List list) {
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
