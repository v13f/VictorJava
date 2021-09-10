package com.company.Lesson09.MyHashSet;

public class Run {
    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(221);
        myHashSet.add(35);
        myHashSet.add(245);

        myHashSet.add(45);

        myHashSet.viwe();

        myHashSet.viewBucketIndex(13);

        System.out.println(" dsfdv   ");

        myHashSet.remove(46);

        myHashSet.viewBucketIndex(13);

    }
}
