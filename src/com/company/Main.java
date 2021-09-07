package com.company;

import java.util.*;

public class Main {
    static Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    });

    public static void main(String[] args) {
//        NavigableSet <Integer> set= new TreeSet<>();
//
//        set.add(1);
//        set.add(2);
//        set.add(7);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        System.out.println(set.toString());
//
//        System.out.println(set.descendingSet());
//
//    }
//    Integer getNextElem (SortedSet <Integer> set){
//
//
//return null;

        SomeType <?> someType = new SomeType<>();
        List <String> list = Arrays.asList("value");
        someType.test(list);
    }
}

  class SomeType<T> {
    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test (List <Integer> integerList) {
        for (Integer i : integerList){
            System.out.println(i);
        }
    }
}