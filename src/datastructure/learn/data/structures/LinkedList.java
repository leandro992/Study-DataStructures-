package datastructure.learn.data.structures;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int size = 0;

    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if (element != null){
            this.head = newNode;
        }else{
            Node<T> currHead = this.head;
            while (currHead.getNext()!=null){
               currHead = currHead.getNext();
            }
            currHead.setNext(newNode);
            this.size++;
        }
    }

}
