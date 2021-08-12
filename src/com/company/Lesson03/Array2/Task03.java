package com.company.Lesson03.Array2;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
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
        int res1=0, res2=0;
        for (int c = 0; c < array.length; c++) {
                res1 += array[c][c];
        }
        int z = array.length-1;
        for (int c = 0; c < array.length; c++) {
                res2 += array[c][z];
            z--;
        }
        System.out.println("сумма слева на право "+ res1 );
        System.out.println("сумма с права на лево "+ res2 );

        if (res1<res2){
            System.out.println("Диагональ с права на лево больше!");
        }else System.out.println("Диагональ слева на право больше!");

    }
}
