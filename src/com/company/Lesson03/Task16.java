package com.company.Lesson03;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива: ");
        int c = scanner.nextInt();
        System.out.println("Введите ограничение для рандома: ");
        int r = scanner.nextInt();
        int[] arr = new int[c];

        for (int i = 0; i<arr.length; i++){
            arr[i]=random.nextInt(r);
            System.out.print(arr [i] + " ");
        }

        for (int i = 0; i<arr.length; i++){
            for (int b = 0; b<arr.length; b++){
                if (arr[i]==arr[b] && i!=b){
                    System.out.println("\n"+"Два массива равны :" + "\n "+ arr[i] + " с номеами массивов "+ i + " и " + b);
                }
            }
        }
    }
}
