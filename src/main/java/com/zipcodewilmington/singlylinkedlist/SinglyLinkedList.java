package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    Node head;
    Node tempNode;

    public SinglyLinkedList() {
        head = new Node();
    }

    public void add(T element) {
        tempNode = head;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(new Node(element, null));
    }

    public Object get(int index) {
        tempNode = head;
        int counter = 0;

        while (counter != index) {
            tempNode = tempNode.getNext();
            counter++;
        }
        return tempNode.getElement();
    }

    public Node getNode(int index) {
        tempNode = head;
        int counter = 0;

        while (counter != index) {
            tempNode = tempNode.getNext();
            counter++;
        }
        return tempNode;
    }

    public void remove(int index) {
        getNode(index - 1).setNext(getNode(index + 1));
    }

    public Boolean contains(T element) {
        tempNode = head;
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
            if (tempNode.getElement() == element) {
                return true;
            }
        }
        return false;
    }

    private class Node<T> {
        T element;

        Node next;

        private Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }

        private Node() {
            this(null, null);
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
