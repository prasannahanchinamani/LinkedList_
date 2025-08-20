package basic_linkedList;

public class BinarySearchLinkedList {


    public static <T extends Comparable<T>> Node<T> binarySearch(Node<T> head, T target) {
        Node<T> start = head;
        Node<T> end = null;

        while (start != end) {
            Node<T> mid = getMiddle(start, end);

            if (mid == null) return null;

            int cmp = mid.data.compareTo(target);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                start = mid.next;
            } else {
                end = mid;
            }
        }
        return null;
    }

    private static <T extends Comparable<T>> Node<T> getMiddle(Node<T> start, Node<T> end) {
        if (start == null) return null;

        Node<T> slow = start;
        Node<T> fast = start;

        while (fast != end && fast.next != end) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
