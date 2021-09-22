package com.company.Lesson03;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n, c = 0, b = 0;
        System.out.println("Введите число больше 3");
        n = scanner.nextInt();


        if (n > 3) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(n);
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    c++;
                }
            }

            int arr2[] = new int[c];

            System.out.println(" ");

            for (int i = 0; i <= c; i++) {
                if (arr[i] % 2 == 0) {
                    arr2[b] = arr[i];
                    b++;
                }
            }

            System.out.println(" ");
            for (int g : arr2)
                System.out.print(g+ " ");
            System.out.println( " - четные числа");
        } else {
            System.out.println("Число введено не верно!");
        }
    }
}
