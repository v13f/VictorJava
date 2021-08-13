package com.company.Lesson03.Array1;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        int arr[] = new int[12];
        Random random = new Random();
        int res = 0, index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            if (res < arr[i]) {
                res = arr[i];
                index = i;
            }

        }
        System.out.println("Максимальное значение: " + res + " - под индексом: " + index);
    }
}
