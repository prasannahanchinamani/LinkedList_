package basic_linkedList;

public class MyLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public Node<T> mergetwoSortedArray(Node<T> list1, Node<T> list2) {
        Node<T> dummy = new Node<>(null);
        Node<T> temp = dummy;
        while (list1 != null && list2 != null) {
//            if (list1.data.comapreTo(list2.data)<=0) {
            if (list1.data.compareTo(list2.data) <= 0) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummy.next;
    }

    public void insertAtend(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printlist() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
