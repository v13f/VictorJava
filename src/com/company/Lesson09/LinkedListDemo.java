package com.company.Lesson09;

public class LinkedListDemo <T> {
    private Node <T> head;
    private Node <T> tail;

    public void add (T t) {
        if (head == null){
            head = new Node<>(t);
            return;
        }
        Node <T> valueHead = head;
        while (valueHead.next != null){
            valueHead = valueHead.next;
        }
        valueHead.next = new Node<>(t);
    }



    private static class Node <T> {
        private final T value;
        private Node <T> next;

        private Node(T value) {
            this.value = value;
        }
    }
}
