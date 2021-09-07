package com.company.Lesson09;

import com.company.Lesson09.Shop.Product;

public class LinkeddList <T> {

    Node node = new Node();

    public LinkeddList(Product p) {
    }

    public void addHead(T t){
        node.next = node.head;
        node.head = new Node<>();


    }

    public void addTail(T t){
        node = node.prev;
        node = new Node<>();
        node.next = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class Node <T>{
        Node <T> next;
        Node <T> prev;
        Node <T> head;
        Node <T> tail;

        T value;
    }

}


