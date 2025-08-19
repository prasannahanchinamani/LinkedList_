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

    // adding at Starting
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

    //insertion at end
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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

    //array to linkedlist
    public void convertArraytoLinkedlist(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            addStarting(arr[i]);
        }
    }

    //end
    Node createLinkedListThroughRecursion(int arr[], int index, int size) {
        if (index == size)
            return null;
        Node temp;
        temp = new Node(arr[index]);
        temp.next = createLinkedListThroughRecursion(arr, index + 1, size);
        return temp;
    }

    //start
    Node createLinkedListThroughRecursionStart(int arr[], int index, int size, Node prev) {
        if (index == size)
            return prev;
        Node temp;
        temp = new Node(arr[index]);
        temp.next = prev;
        return createLinkedListThroughRecursionStart(arr, index + 1, size, temp);
    }

    public void insertAt(int index, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        }
        Node curr = head;
        int count = 0;
        while (curr != null && count < index - 1) {
            curr = curr.next;
            count++;
        }
        if (curr == null)
            System.out.println("Index Bound nt in range..");

        newNode.next = curr.next;
        curr.next = newNode;
    }
}

public class SinglularLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.addStarting(20);
//        linkedList.addStarting(21);
        linkedList.displaylist();
        int arr[] = {1, 2, 3, 4, 5};
        linkedList.convertArraytoLinkedlist(arr);
        linkedList.displaylist();
        linkedList.addStarting(20);
        linkedList.displaylist();
        linkedList.addAtEnd(6);
        linkedList.displaylist();
        //head i will get on that
        linkedList.head = linkedList.createLinkedListThroughRecursion(arr, 0, arr.length);
        linkedList.displaylist();
        linkedList.head = linkedList.createLinkedListThroughRecursionStart(arr, 0, arr.length, null);
        linkedList.displaylist();
        linkedList.insertAt(3,55);
        linkedList.displaylist();


    }

}
