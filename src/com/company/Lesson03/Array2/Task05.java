package com.company.Lesson03.Array2;

import java.util.Random;
import java.util.Scanner;

public class Task05 {
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
        System.out.println(" ");

        int array2[] = new int[i];

        for (int q = 0; q < array.length; q++) {
            array2[q] = array[0][q];
            array[0][q] = array[q][0];
            array[q][0] = array2[q];
        }
        for (int x = 0; x < array.length; x++) {
            for (int z = 0; z < array.length; z++) {
                System.out.print(array[x][z] + " ");
            }
            System.out.println("");
        }
    }
}
