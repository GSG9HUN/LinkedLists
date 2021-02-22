package com.company;

public class DoubleReferencesListNode implements Node{

    final String value;
    DoubleReferencesListNode next;
    DoubleReferencesListNode previous;


    DoubleReferencesListNode(String value){
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }


    public DoubleReferencesListNode getNext() {
        return next;
    }

    public void setNext(DoubleReferencesListNode next) {
        this.next = next;
    }

    public DoubleReferencesListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleReferencesListNode previous) {
        this.previous = previous;
    }
}
