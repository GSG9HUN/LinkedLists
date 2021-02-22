package com.company;

import java.awt.*;

public class NoReferenceList implements List{

    NoReferenceListNode[] nodes;

    @Override
    public void add(String value) {

        if(nodes==null){
            nodes = new NoReferenceListNode[1];
            NoReferenceListNode first= new NoReferenceListNode(value);
            nodes[0]= first;
            return;
        }
        int i=0;

        for(;nodes.length>i;i++){
            if(nodes[i]==null) {
                NoReferenceListNode newNode = new NoReferenceListNode(value);
                nodes[i] = newNode;
                return;
            }
        }

        NoReferenceListNode[] newNodes = new NoReferenceListNode[nodes.length+1];

        for(i=0;nodes.length>i;i++){
            newNodes[i]=nodes[i];
        }
        NoReferenceListNode newNode = new NoReferenceListNode(value);
        newNodes[i]=newNode;
        nodes = newNodes;




    }

    @Override
    public void delete(Node node) {
        if(nodes==null){
            return;
         }
        NoReferenceListNode[] newNodes = new NoReferenceListNode[nodes.length-1];
        int i=0,j=0;
        for(;nodes.length>i;i++){
            if(nodes[i]!=node){
                newNodes[j]=nodes[i];
                j++;
            }

        }

        nodes=newNodes;

    }

    @Override
    public Node find(String value) {

        if(nodes==null)
        {
            return null;
        }

        for(int i=0; nodes.length>i;i++){
            if(nodes[i].getValue()==value){
                return nodes[i];
            }
        }

        return null;
    }

    @Override
    public String[] getValues() {
        if(nodes==null){
            return new String[]{};
        }
        String[] strings = new String[nodes.length];
        for(int i=0;nodes.length>i;i++){
            strings[i]=nodes[i].getValue();
        }
        return strings;
    }
}
