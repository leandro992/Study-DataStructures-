package datastructure.learn.data.structures;

public class LinkedList {
    private Node head;
    private int size;

    public int get(int index){
        if (index > size || index < 0) return -1;
        Node node = head;
        for(int i =0; i < index; i++) node = node.getNext();
        return node == null ? -1 : (int) node.getElement();
    }

}
