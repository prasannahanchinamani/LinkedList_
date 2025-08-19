package basic_linkedList;
import java.util.LinkedList;

public class BuiltInLinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.addFirst(5);
        list.addLast(20);

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }
}
