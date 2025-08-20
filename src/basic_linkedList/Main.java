package basic_linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.insertAtend(5);
        list.insertAtend(2);
        list.insertAtend(8);
        list.insertAtend(1);

        System.out.println("Original List:");
        list.printlist();

        // Sort the list first
        list.head = list.sort(list.head);
        System.out.println("Sorted List:");
        list.printlist();

        // Search for target
        int target = 5;
        Node<Integer> result = BinarySearchLinkedList.binarySearch(list.head, target);

        if (result != null) {
            System.out.println("Found: " + result.data);
        } else {
            System.out.println("Not Found");
        }
    }


}