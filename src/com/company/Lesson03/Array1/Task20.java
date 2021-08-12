package com.company.Lesson03.Array1;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
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
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
                f = i;
            }
        }
        arr [f]=arr[0];
        arr [0]= max;

        System.out.println(" ");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
