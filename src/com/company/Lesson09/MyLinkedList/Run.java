package com.company.Lesson09.MyLinkedList;

public class Run {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(20);
        myLinkedList.add(21);
        myLinkedList.add(22);
        myLinkedList.add(23);
        myLinkedList.add(24);
        myLinkedList.add(25);
        myLinkedList.add(26);
        myLinkedList.add(27);



        myLinkedList.size();
//удаление элемента
        myLinkedList.remove(4);
//размер листа
        myLinkedList.size();

        System.out.println(myLinkedList.indexOf(22));

        System.out.println(myLinkedList.get(4));

        System.out.println(myLinkedList.indexOf(32));

        System.out.println(myLinkedList.lastIndexOf(24));

        System.out.println(myLinkedList.isEmpty());
    }
}
