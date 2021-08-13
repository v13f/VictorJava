package com.company.Lesson03.Array1;

import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива: ");
        int c = scanner.nextInt();
        System.out.println("Введите ограничение для рандома: ");
        int r = scanner.nextInt();
        int[] arr = new int[c];
        int max = 0, f = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(r);
            System.out.print(arr[i] + " ");
        }
        for (int j : arr) {
            if (j > max) {
                max = j;
                f++;
            }
        }
        int[] arr2 = new int[f];

        for (int j : arr) {
            if (j > max) {
                max = j;
                for (int z = 0; z < arr2.length; z++) {
                    arr2[z] = max;
                    System.out.print(arr2[z]+ " ");
                }
            }
        }
        System.out.println("\n"+ "sfdfs"+ arr2[3]);
    }

}