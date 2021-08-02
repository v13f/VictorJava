package com.company.Lesson02;

public class N2 {
    public static void main(String[] args) {

        int hour, cell = 0;

        for (hour = 0; hour<=24; hour = hour+3){
            System.out.println("час "+ hour + " клеток "+ cell);
            cell += 2;

        }
    }
}
