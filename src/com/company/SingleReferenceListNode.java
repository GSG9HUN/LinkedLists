package com.company;

public class SingleReferenceListNode implements Node {
    final String value;
    SingleReferenceListNode next;




    SingleReferenceListNode(String value){
        this.value = value;
    }

    public SingleReferenceListNode getNext() {
        return next;
    }

    public void setNext(SingleReferenceListNode next) {
        this.next = next;
    }

    @Override
    public String getValue() {
        return value;
    }
}
