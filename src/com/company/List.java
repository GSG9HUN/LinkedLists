package com.company;

public interface List {

    void add(String value);

    void delete(Node node);

    Node find(String value);

    String[] getValues();
}
