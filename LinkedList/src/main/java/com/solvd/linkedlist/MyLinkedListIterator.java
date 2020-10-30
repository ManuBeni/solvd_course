package com.solvd.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedListIterator<T> implements Iterator<T> {

    private Node<T> actualNode;

    public MyLinkedListIterator(Node<T> firstNode){
        actualNode=firstNode;
    }

    @Override
    public boolean hasNext() {
        return actualNode != null;
    }

    @Override
    public T next() {
        if(actualNode==null)
            throw new NoSuchElementException();
        Node<T> tmpNode=actualNode;
        actualNode=actualNode.getNextNode();
        return tmpNode.getObject();
    }
}
