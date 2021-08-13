package com.company.Lesson03.Array1;

import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите ограничение для массива: ");
        int num = scr.nextInt();
        if (num <= 0) {
            System.out.println("Введенное вами число не подходит!");
        } else {
            int arr[] = new int[num];
            int left = 0, right = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(15);
                System.out.print(arr[i] + " ");
                if (i == num / 2 - 1) {
                    System.out.print("  |  ");
                }
            }

            System.out.println(" ");

            for (int i = 0; i < num / 2; i++) {
                left += arr[i];
            }

            for (int i = num - 1; i > num / 2 - 1; i--)
                right += arr[i];

            System.out.println("Значение в левой части - " + left + "\n" + "Значение в правой части -  " + right);
        }
    }
}

