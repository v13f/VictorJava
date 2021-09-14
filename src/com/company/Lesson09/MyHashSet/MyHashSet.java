package com.company.Lesson09.MyHashSet;

import com.company.Lesson09.MyLinkedList.MyLinkedList;

public class MyHashSet <T> {
    MyLinkedList <T> [] array = new MyLinkedList[16];

    public void add(T number) {
        if (array[indexBucketArray(number)] == null) {
            array[indexBucketArray(number)] = new MyLinkedList<T>();
        }
        if (!array[indexBucketArray(number)].contains(number)) {
            array[indexBucketArray(number)].add(number);
        }
    }


    public void addAll(MyLinkedList <T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    public void remove(T num) {
        if (array[indexBucketArray(num)] != null) {
            if (array[indexBucketArray(num)].contains(num)) {
                array[indexBucketArray(num)].remove(array[indexBucketArray(num)].indexOf(num));
            }
        }else {
            System.out.println("Такого объекта нет");
        }
    }


    public void viewBucketIndex(int index) {
        array[index].viewList();
    }

    public Integer indexBucketArray(T number) {
        if (number.hashCode()<0){
            return number.hashCode()*-1 % array.length;
        }
        return number.hashCode() % array.length;
    }

    public void viwe() {
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " " + i);
            if (array[i] != null) {
                array[i].viewList();
            }
        }
    }
}