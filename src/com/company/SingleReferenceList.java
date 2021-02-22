package com.company;

import java.util.ArrayList;

public class SingleReferenceList implements List{

    SingleReferenceListNode first = null ;

    @Override
    public void add(String value) {

        if(first==null){
            first = new SingleReferenceListNode(value);
            first.setNext(null);
            return;
        }


        SingleReferenceListNode current = first;
        while (current.getNext()!=null){
            current = current.getNext();
        }

        SingleReferenceListNode newNode = new SingleReferenceListNode(value);

       current.setNext(newNode);

    }

    @Override
    public void delete(Node node) {

        if(first==null){
            return;
        }

        SingleReferenceListNode current =first;
        SingleReferenceListNode before=current;
        while (current.getNext()!=null){
            if (current==node) {
                before.setNext(current.getNext());
            }
            before=current;
            current=current.getNext();
        }


    }

    @Override
    public Node find(String value) {
        if(first == null){
            return null;
        }

        SingleReferenceListNode current = first;

        while(current.getNext()!=null){
            if(current.getValue()==value){
                return current;
            }
            current=current.getNext();
        }

        return null;
    }

    @Override
    public String[] getValues() {
        if(first==null)
            return new String[]{};

        ArrayList<String> stringValues = new ArrayList<>();
        SingleReferenceListNode current = first;

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
