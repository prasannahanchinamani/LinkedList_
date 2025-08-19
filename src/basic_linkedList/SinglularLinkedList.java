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

    public void deleteStarting() {
        if (head != null) {
            Node temp = head;
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, no nodes to delete.");
            return;
        }

        if (head.next == null) {
            // If only one node exists
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtindex(int index) {
        if (head == null) {
            System.out.println("Not pressent ");
            return;
        }
        Node curr = head;
        Node prev = null;
        int count = 0;
        while (curr != null && count < index) {
            prev=curr;
            curr=curr.next;
            count++;
        }
        if(curr==null)
            System.out.println("Index Bound");
        prev.next=curr.next;
    }
}

public class SinglularLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.displaylist();
        int arr[] = {1, 2, 3, 4, 5,5,5,6,6,7,7,9};
        linkedList.displaylist();
        // Convert array to linked list
        linkedList.convertArraytoLinkedlist(arr);
        // Display the constructed linked list
        linkedList.displaylist();  // Output: 1 2 3 4 5
        linkedList.deleteStarting();
        linkedList.displaylist();
        linkedList.deleteLast();
        linkedList.displaylist();
        linkedList.deleteAtindex(1);
        linkedList.displaylist();


    }

}
