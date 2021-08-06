package com.company.Lesson01;

public class Task02 {

    public static void main (String[] args){

        int a = 4, b = 7, c = 9;

        if (a<b+c && b<a+c && c<b+a){
            System.out.println("Треугольник существует");
        }else {
            System.out.println("Треугольник не существует");
        }
    }
}
