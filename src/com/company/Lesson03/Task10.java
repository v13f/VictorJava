package com.company.Lesson03;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n, c = 0;
        System.out.println("Введите число больше 3");
        n = scanner.nextInt();
        int arr2[] = new int[c];

        if (n > 3) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(n);
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i<arr.length; i++){
                if (arr[1]%2 ==0){
                    c++;
                }

            }
            for (int i = 0; i< arr2.length; i++)
                c=0;
                if (arr[i] % 2 == 0) {
                    arr2[c] = arr[i];
                    c++;
            System.out.println(" ");
            for (int i : arr2)
                if (i>0)
                System.out.print(i + " ");
        } else {
            System.out.println("Число введено не верно!");
        }
    }
}
