package com.company.Lesson03.Array1;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {

            arr[i] = random.nextInt(99);
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        int num = 0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 == 0) {
                num++;
            }
        }
        System.out.println("Колличество четных чисел " + num);
    }
}
