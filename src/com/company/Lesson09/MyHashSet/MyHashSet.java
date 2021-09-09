package com.company.Lesson09.MyHashSet;

public class MyHashSet {
    Element[] array = new Element[16];


    public void add(Integer number) {
        Element el = new Element();
        el.value = number;
        if (array[numArr(el)] == null) {
            array[numArr(el)] = el;
        } else {
            do {
                array[numArr(el)].next = array[numArr(el)];
                array[numArr(el)] = el;

                System.out.println(array[numArr(el)].hashCode());
                System.out.println(" ----");



                if (array[numArr(el)].hashCode() == array[numArr(el)].next.hashCode()) {
                    if (array[numArr(el)].equals(array[numArr(el)].next)) {
                        System.out.println("Такой элемент уже есть");
                        return;
                    }
                }
            } while (array[numArr(el)].next != null);


        }


    }

    public Integer numArr(Element element) {
        Integer res = element.value.hashCode() % array.length;
        return res;
    }

    public void viwe() {
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " " + i);

        }
    }
}