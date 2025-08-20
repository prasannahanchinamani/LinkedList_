package basic_linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.insertAtend(1);
        list1.insertAtend(3);
        list1.insertAtend(1);
        list1.insertAtend(3);
        list1.insertAtend(8);
        list1.insertAtend(4);


        MyLinkedList<Integer> sortList = new MyLinkedList<>();
        sortList.head = sortList.sort(list1.head);
        sortList.printlist();

//        miidleList.head=miidleList.midValue(list1.head);
//        miidleList.printlist();

    }
}