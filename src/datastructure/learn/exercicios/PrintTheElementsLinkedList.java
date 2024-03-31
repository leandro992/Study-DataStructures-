package datastructure.learn.exercicios;

import java.util.Objects;

public class PrintTheElementsLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    // Complete the printLinkedList function below.

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(10);
        list.insertNode(11);
        list.insertNode(14);
        list.insertNode(16);
        list.insertNode(10);

        printLinkedList(list.head);
    }


    static void printLinkedList(SinglyLinkedListNode head) {
        if (Objects.isNull(head)){
            System.out.println("");
        }

//        for (int i = 0; i < head.data; i++) {
//            System.out.printf(String.valueOf(data));
//        }

    }
}
