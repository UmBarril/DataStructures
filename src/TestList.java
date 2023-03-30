import list.ArrayList;
import list.List;

public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
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
