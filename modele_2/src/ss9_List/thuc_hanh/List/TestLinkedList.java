package ss9_List.thuc_hanh.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(8);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4,9);
        ll.add(4,10);
        ll.printList();
    }
}
