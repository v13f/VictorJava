package com.company.Lesson03.Array1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        int res = 0;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
            if (arr[i] % 3 == 0) {
                res += arr[i];
            }
        }
        System.out.println("\n" + "Произведение чисел кратных 3 равно: " + res);
    }

}

