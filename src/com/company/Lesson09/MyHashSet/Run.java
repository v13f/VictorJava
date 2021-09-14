package com.company.Lesson09.MyHashSet;

public class Run {
    public static void main(String[] args) {

        MyHashSet <String> myHashSet = new MyHashSet <String>();
        myHashSet.add("Stas");
        myHashSet.add("Misha");
        myHashSet.add("Siyar");

        myHashSet.add("Victor");

        myHashSet.viwe();

        myHashSet.viewBucketIndex(9);

        System.out.println(" dsfdv   ");

        myHashSet.remove("Victor");

        myHashSet.viewBucketIndex(9);

        myHashSet.add("Victor");
        myHashSet.viewBucketIndex(9);
    }
}
