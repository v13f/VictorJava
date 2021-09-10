package com.company.Lesson09.MyHashSet;

import com.company.Lesson09.MyLinkedList.MyLinkedList;

public class MyHashSet {
    MyLinkedList[] array = new MyLinkedList[16];

    public void add(Integer number) {
        if (array[indexBucketArray(number)] == null) {
            array[indexBucketArray(number)] = new MyLinkedList();
        }
        if (!array[indexBucketArray(number)].contains(number)) {
            array[indexBucketArray(number)].add(number);
        }
    }


    public void addAll(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    public void remove(Integer num) {
        if (array[indexBucketArray(num)] != null) {
            if (array[indexBucketArray(num)].contains(num)) {
                array[indexBucketArray(num)].remove(array[indexBucketArray(num)].containsIndex(num));
            }
        }else {
            System.out.println("Токого числа нет");
        }
    }


    public void viewBucketIndex(int index) {
        array[index].viewList();
    }

    public Integer indexBucketArray(Integer number) {
        Integer res = number.hashCode() % array.length;
        return res;
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