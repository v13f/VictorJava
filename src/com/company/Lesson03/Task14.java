package com.company.Lesson03;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива: ");
        int c=scanner.nextInt();
        System.out.println("Введите ограничение для рандома: ");
        int r=scanner.nextInt();
        int min =r;
        int[]arr = new int[c];
        for (int i = 0; i<arr.length; i++){
            arr[i]=random.nextInt(r);
            System.out.print(arr[i] + " ");
            if (arr[i] %2 != 0){
                if (arr[i]<min)
                min = arr[i];
            }
        }
        System.out.println("\n"+"Минимальное нечетное число:"+min);
    }
}
