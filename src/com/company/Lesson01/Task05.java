package com.company.Lesson01;

public class Task05 {

    public static void main(String[] args) {

        int a = -4, b = 6, c = 3, r=0, f=0 ;

        if (a>0) {
            r++;
        }else if (a<0){
            f++;
        }
        if (b>0){
            r++;
        }else if (b<0){
            f++;
        }
        if (c>0) {
            r++;
        }else if (c<0){
            f++;
        }
        System.out.println(r + " положительных числа");
        System.out.println(f + " отрицательных числа");
    }
}
