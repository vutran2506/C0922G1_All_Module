package ss9_List.bai_tap.MyLinkedList;

public class MyLinkedList<E> {
    private  class Node{
        private  Node next;
        private  Object data;
        public  Node(Object data){
            this.data = data;
        }
        public  Object getData(){
            return this.data;
        }
    }
    private  Node head;
    private  int numNode = 0;

    public MyLinkedList() {

    }
    public  void  addFirst(E element){
        Node temp = head;
    }
}
