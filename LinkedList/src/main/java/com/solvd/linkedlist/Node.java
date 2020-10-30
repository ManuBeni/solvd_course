package com.solvd.linkedlist;

public class Node<T> {
    private T object;
    private Node<T> nextNode = null;

    public Node(T object) {
        this.object = object;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public T getObject() {
        return object;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
