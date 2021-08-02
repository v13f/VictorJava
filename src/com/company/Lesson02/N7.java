package com.company.Lesson02;

public class N7 {
    public static void main(String[] args) {

        int num = 0, sum = 0;
        for (num = 0; num < 100; num++){
            if (num %2 == 1){
                sum +=num;
            }
        }
        System.out.println(sum+1);
    }
}