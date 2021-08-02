package com.company.Lesson01;

public class N7 {

    public static void main(String[] args) {

        int a = 23;

        if (a==1 || a == 21 || a == 31){
            System.out.println(a + " программист");
        } else if (a >1 && a<5 || a>21 && a<25 || a>31 && a<35){
            System.out.println(a+ " програмиста");
        } else if (a>4 &&a <21 || a>24 && a<31 || a>34 && a<41){
            System.out.println(a+ " програмистов");
        }
    }
}
