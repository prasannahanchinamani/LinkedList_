package basic_linkedList;

public class MyLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public Node<T> sort(Node<T> list) {
        if (list == null||list.next==null)
            return list;
//        if (head == null || head.next == null)
//            return head;
        Node<T> mid = getMiddle(list);
        Node<T> right = mid.next;
        mid.next = null;
        Node<T> leftsort = sort(list);
        Node<T> rightsort = sort(right);

        return mergeSort( rightsort,leftsort);
    }

    public Node<T> mergeSort(Node<T> list1, Node<T> list2) {
        Node<T> dummy = new Node<>(null);
        Node<T> temp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.data.compareTo(list2.data) >=0) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public Node<T> getMiddle(Node<T> list) {
        if (list == null) return null;
        Node<T> slow = list;
        Node<T> fast = list;
        while (fast.next!= null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
