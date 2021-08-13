package com.company.Lesson03.Array1;

public class Task02 {

    public static void main(String[] args) {

        int num = 0, i, a = 0;

        for (i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                num++;
            }
        }

        int[] mas = new int[num];

        for (i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                mas[a] = i;

                System.out.print(mas[a] + " ");
                a++;

            }
        }

        System.out.println(" ");

        for (i = num-1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }
}
