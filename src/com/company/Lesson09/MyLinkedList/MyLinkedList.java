package com.company.Lesson09.MyLinkedList;

public class MyLinkedList {
    Element head;
    Element tail;

    public void add(Integer i) {
        Element element = new Element();
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

    public void addFirst(Integer i) {
        Element element = new Element();
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
        Element el = head;
        while (el.next != null) {
            el = el.next;
//            System.out.println(el.value);
            i++;
        }
        System.out.println("Size list: " + i);

        return i;
    }

    public boolean remove(int index) {
        Element el = head;
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

    public boolean contains(Integer num) {
        Element el = head;
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

    public Integer containsIndex(Integer num) {
        Element el = head;
        if (head == null) {
            return null;
        }
        int index = 0;
        while (el != null) {
            if (el.value == num) {
                return index;
            }
            index++;
            el = el.next;
        }
        return null;
    }


    public Integer get(int index) {
        Element el = head;
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

    public Integer indexOf(int num) {
        int index = 0;
        Element el = head;
        if (head == null) {
            return null;
        }
        while (el.next != null) {
            if (num == el.value) {
                return index;
            }
            el = el.next;
            index++;
        }
        return null;
    }

    public Integer lastIndexOf(int number) {
        Element el = tail;
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
        Element el = head;
        int i = 0;
        do {
            System.out.print(i +" элелемент = "+ el.value + " ");
            el = el.next;
            i++;
            }while (el != null);
        System.out.println(" ");
        }


    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
}
