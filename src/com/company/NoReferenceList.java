package com.company;

public class NoReferenceList implements List{
    @Override
    public void add(String value) {

    }

    @Override
    public void delete(Node node) {

    }

    @Override
    public Node find(String value) {
        return null;
    }

    @Override
    public String[] getValues() {
        return new String[0];
    }
}
