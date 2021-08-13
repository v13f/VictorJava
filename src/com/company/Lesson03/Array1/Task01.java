package com.company.Lesson03.Array1;

public class Task01 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0) {
                num++;
            }
        }
        int[] arr = new int[num];
        for (int i = 2, n = 0; i < 21; i++) {
            if (i % 2 == 0) {
                arr[n] = i;
                System.out.print(arr[n] + " ");
                n++;
            }
        }
        System.out.println("");

        for (int i = 2, n = 0; i <= num - 1; i++) {
            System.out.println(arr[n]);
            n++;
        }
    }
}
