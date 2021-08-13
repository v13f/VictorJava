package com.company.Lesson03.Array1;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива: ");
        int c = scanner.nextInt();
        System.out.println("Введите ограничение для рандома: ");
        int r = scanner.nextInt();
        int[] arr = new int[c];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(r);
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(" ");
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
