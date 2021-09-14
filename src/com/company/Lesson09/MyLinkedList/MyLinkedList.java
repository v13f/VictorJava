package com.company.Lesson09.MyLinkedList;

public class MyLinkedList<T> {
    Element<T> head;
    Element<T> tail;

    public void add(T i) {
        Element<T> element = new Element<T>();
        element.value = i;
        if (head == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            element.prev = tail;
            tail = element;
        }
    }

    public void addFirst(T i) {
        Element<T> element = new <T>Element();
        element.value = i;
        if (head == null) {
            head = element;
            tail = element;
        } else {
            head.prev = element;
            element.next = head;
            head = element;
        }

    }

    public int size() {
        if (head == null) {
            System.out.println(0);
            return 0;
        }
        int i = 1;
        Element<T> el = head;
        while (el.next != null) {
            el = el.next;
//            System.out.println(el.value);
            i++;
        }
        System.out.println("Size list: " + i);

        return i;
    }

    public boolean remove(int index) {
        Element<T> el = head;
        if (head == null) {
            return false;
        }
        if (index == 0) {
            head = el.next;
        }
        int x = 1;
        while (el.next != null) {
            if (index == x) {
                el.next = el.next.next;
                return true;
            }
            el = el.next;
            x++;
        }
        return false;
    }

    public boolean contains(T num) {
        Element<T> el = head;
        if (head == null) {
            return false;
        }
        while (el != null) {
            if (el.value == num) {
                return true;
            }
            el = el.next;
        }
        return false;
    }


    public T get(int index) {
        Element<T> el = head;
        if (head == null) {
            return null;
        }
        int x = 0;
        while (el.next != null) {
            if (x == index) {
                return el.value;
            }
            el = el.next;
            x++;
        }
        return null;

    }

    public Integer indexOf(T num) {
        int index = 0;
        Element<T> el = head;
        if (head == null) {
            return null;
        }
        while (el != null) {
            if (num == el.value) {
                return index;
            }
            el = el.next;
            index++;
        }
        return null;
    }

    public Integer lastIndexOf(T number) {
        Element<T> el = tail;
        if (head == null) {
            return null;
        }
        int x = size();
        while (el.prev != null) {
            if (number == el.prev.value) {
                return x;
            }
            el = el.prev;
            x--;
        }
        return null;
    }

    public void viewList() {
        Element<T> el = head;
        int i = 0;
        while (el != null) {
            System.out.print(i + " элелемент = " + el.value + " ");
            el = el.next;
            i++;
        }
            System.out.println(" ");
        }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
}
