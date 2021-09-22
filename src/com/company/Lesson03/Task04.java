package com.company.Lesson03;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[19];
        for (int i = 0; i < 19; i++) {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < 19; i++) {
            if (arr[i] % 2 == 1)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
}
