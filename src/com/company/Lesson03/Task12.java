package com.company.Lesson03;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int c = scanner.nextInt();
        int b = 1;
        float res = 0, finalRes;
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 1) {
                res += arr[i];
                b++;
            }
        }
        finalRes = res / b;
        System.out.println(finalRes);
    }
}
