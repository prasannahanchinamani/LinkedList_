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

    public int search(int element) {
        Node curr = head;
        int position = 1;
        while (curr != null) {
            if (curr.data == element)
                return position;
            curr = curr.next;
            position++;
        }
        return -1;
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
        System.out.println("Index start from you "+linkedList.search(3));

    }

}
