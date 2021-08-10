package com.company.Lesson03;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int y = scanner.nextInt();
        System.out.println("Введите число 'C'");
        int c = scanner.nextInt();
        int b = 0;
        double res = 0, finalRes;
        int[] arr = new int[y];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
            if (arr[i] > c) {
                res += arr[i];
                b++;
            }

        }
        finalRes = res / b;
        System.out.println(finalRes);
    }
}
