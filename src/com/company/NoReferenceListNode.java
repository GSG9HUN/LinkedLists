package com.company;

public class NoReferenceListNode implements Node{

    String value;

    NoReferenceListNode(String value){
        this.value=value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
