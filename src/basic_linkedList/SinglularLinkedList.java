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
 public void addAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=newNode;
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

    }

}
