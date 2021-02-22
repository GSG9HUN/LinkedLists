package com.company;

import java.util.ArrayList;

public class DoubleReferencesList implements List {

    private DoubleReferencesListNode first;
    private DoubleReferencesListNode last;

    @Override
    public void add(String value) {
        if(first == null){
            first = new DoubleReferencesListNode(value);
            first.setNext(null);
            first.setPrevious(null);
            return;
        }

        if(last==null){
            last = new DoubleReferencesListNode(value);
            first.setNext(last);
            last.setPrevious(first);
            last.setNext(null);
            return;
        }

        DoubleReferencesListNode newNode = new DoubleReferencesListNode(value);
        DoubleReferencesListNode tmp = last;
        last = newNode;
        newNode = tmp;
        newNode.setNext(last);
        last.setPrevious(newNode);




        /*DoubleReferencesListNode newNode = new DoubleReferencesListNode(value);
        newNode.setNext(first.getNext());
        first.setNext(newNode);
        newNode.setPrevious(first);*/

    }

    @Override
    public void delete(Node node) {
        if(first==null){
            return;
        }
        DoubleReferencesListNode current = first;

        while(current.getNext()!=null){
            if(current==node){
                DoubleReferencesListNode prev = current.getPrevious();
                DoubleReferencesListNode next = current.getNext();
                prev.setNext(next);
                next.setPrevious(prev);
            }
            current =current.getNext();
        }
    }

    @Override
    public Node find(String value) {
        if(first == null)
            return null;
        DoubleReferencesListNode current = first;
        while(current.getNext()!=null){
            if(current.getValue() == value)
                return current;
            current=current.getNext();
        }
        return null;
    }

    @Override
    public String[] getValues() {
        if(first==null)
            return new String[]{};

        ArrayList<String> stringValues = new ArrayList<>();
        DoubleReferencesListNode current = first;

        while(current!=null){
            stringValues.add(current.getValue());
            current=current.getNext();
        }

        String[] strings = new String[stringValues.size()];
        for (int i=0 ;i < strings.length;i++){
            strings[i]=stringValues.get(i);
        }

        return strings;
    }
}
