package basic_linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.insertAtend(1);
        list1.insertAtend(3);
        list1.insertAtend(5);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.insertAtend(2);
        list2.insertAtend(4);
        list2.insertAtend(6);

        MyLinkedList<Integer> mergedList = new MyLinkedList<>();
        mergedList.head = mergedList.mergetwoSortedArray(list1.head, list2.head);

        System.out.print("Merged List: ");
        mergedList.printlist();
    }
}