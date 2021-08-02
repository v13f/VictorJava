package com.company.Lesson02;

public class N8 {
    public static void main(String[] args) {

        int star, num;

        for (num = 1;num<5;num++) {
            for (star = 0; star < num; star++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (num =0; num < 5; num++) {
            for (star = 4; star > num; star--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
