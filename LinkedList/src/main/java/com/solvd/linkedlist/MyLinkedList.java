package com.solvd.linkedlist;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
    private Node<T> head = null;
    private static int counter;

    public MyLinkedList(){}

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public int size(){
        return counter;
    }

    public void add(T object){
        if (head==null){
            head= new Node<>(object);
        }else {
            Node<T> current = head;

            while(current.getNextNode()!=null){
                current=current.getNextNode();
            }
            current.setNextNode(new Node<>(object));
        }
        incrementCounter();
    }

    public void add(T object, int index){
        int counter = 1;
        Node<T> oldNode = head;
        Node<T> actNode = head.getNextNode();
        if (index==0) {
            head= new Node<>(object);
        }
        while (actNode!=null) {
            if (counter==index) {
                Node<T> newNode = new Node<>(object);
                oldNode.setNextNode(newNode);
                newNode.setNextNode(actNode);
            }
            counter++;
            oldNode=actNode;
            actNode=actNode.getNextNode();
        }
        if (counter==index) {
            oldNode.setNextNode(new Node<>(object));
        }
        incrementCounter();
    }

    public void remove(T object) {

        Node<T> current=this.head,tmp = null;

        if(current!=null && current.getObject()==object){
            this.head=current.getNextNode();
            decrementCounter();
        }
        while (current != null && current.getObject()!=object){
            tmp = current;
            current=current.getNextNode();
        }
        if(current != null){
            assert tmp != null;
            tmp.setNextNode(current.getNextNode());
            decrementCounter();
        }
        if (current==null){
            System.out.println("Object not found.");
        }
    }

    public void reverse() {
        Node<T> oldNode = null;
        Node<T> actNode = head;
        Node<T> nextNode;
        do {
            nextNode = actNode.getNextNode();
            actNode.setNextNode(oldNode);
            oldNode = actNode;
            actNode = nextNode;
        } while (actNode != null);
        head=oldNode;
    }

    public T get(int index){
        int counter=0;
        for(T object:this){
            if (counter==index){
                return object;
            }
            counter++;
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node<T> current = head;
        while(true){
            assert current != null;
            if (current.getNextNode() == null){
                result.append(current.getObject());
                break;
            }
            result.append(current.getObject());
            if(current.getNextNode() != null){
                result.append(", ");
            }
            current = current.getNextNode();
        }
        return "List: " + result;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator<T>(head);
    }
}
