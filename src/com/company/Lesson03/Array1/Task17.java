package com.company.Lesson03.Array1;

import java.util.Random;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива: ");
        int c = scanner.nextInt();
        System.out.println("Введите ограничение для рандома: ");
        int r = scanner.nextInt();
        System.out.println("Введите число для поиска: ");
        int s = scanner.nextInt();
        int[] arr = new int[c];

        for (int i = 0; i<arr.length; i++){
            arr[i]=random.nextInt(r);
            System.out.print(arr [i] + " ");
        }
        int b = 0;
        for (int i : arr){
            if(i == s){
                b++;
            }
        }
        System.out.println("Число " + s + " встречаеться " + b + " раз");
                }
            }



