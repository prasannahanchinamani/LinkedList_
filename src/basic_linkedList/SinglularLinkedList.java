package basic_linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Floyd's cycle detection method
    public boolean hasCycle() {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           //  by 1
            fast = fast.next.next;      //  by 2

            if (slow == fast) {
                return true;            // cycle detected
            }
        }
        return false;                   // no cycle
    }

    public void addStarting(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            current = new Node(data);
            current.next = head;
            head = current;
        }
    }

    public void convertArraytoLinkedlist(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            addStarting(arr[i]);
        }
    }

    // display or printList
    public void displaylist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }
}

public class SinglularLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.displaylist();
        int arr[] = {1, 2, 3, 4, 5};
        linkedList.displaylist();
        // Convert array to linked list
        linkedList.convertArraytoLinkedlist(arr);
        // Display the constructed linked list
        linkedList.displaylist();  // Output: 1 2 3 4 5
        System.out.println("cyclic: "+linkedList.hasCycle());
        //adding last
        Node temp = linkedList.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = linkedList.head.next;//2
        System.out.println("cyclic: "+linkedList.hasCycle());


    }

}
