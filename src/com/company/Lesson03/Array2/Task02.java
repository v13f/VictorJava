package com.company.Lesson03.Array2;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ограничение массива: ");
        int i = scanner.nextInt();

        int array[][] = new int[i][i];

        for (int x = 0; x < array.length; x++) {
            for (int z = 0; z < array.length; z++) {
                array[x][z] = random.nextInt(50);
                System.out.print(array[x][z] + " ");
            }
            System.out.println("");
        }
        int res = 0;
        int x = 1;
        for (int c = 0; c < array.length; c++) {
            if (x < array.length) {
                if (array[x][c] % 2 == 0) {
                    res += array[x][c];
                }
                x++;
            }
        }
        System.out.println("сумма " + res);
    }

}