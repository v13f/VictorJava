package com.company.Lesson03.Array1;

import java.util.Random;
import java.util.Scanner;

public class Tack19 {
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
        int min = r;
        for (int j = 0; j < arr.length; j += 2) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("Минимально число из массива с четным индексом: " + min);
    }
}
