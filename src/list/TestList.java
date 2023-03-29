package list;

public class TestList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
