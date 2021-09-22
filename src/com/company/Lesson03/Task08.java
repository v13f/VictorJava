package com.company.Lesson03;

import java.text.DecimalFormat;
import java.util.Random;

public class Task08 {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        int arr01[] = new int[10];
        int arr02[] = new int[10];
        float arr03[] = new float[10];
        int b = 0;

        Random random = new Random();

        for (int i = 0; i < arr01.length; i++) {
            arr01[i] = random.nextInt(9);
            arr02[i] = random.nextInt(9);
            arr03[i] = (float) arr01[i] / arr02[i];
        }

        for (int i : arr01) {
            System.out.print(i + "  | ");
        }

        System.out.println(" ");

        for (int i : arr02) {
            ;
            System.out.print(i + "  | ");
        }

        System.out.println(" ");

        for (float i : arr03) {
            System.out.print(decimalFormat.format(i) + " | ");
            if (i % 1 == 0 || i % 2 == 0) {
                b++;
            }
        }
        System.out.println(" ");
        System.out.println(b + " - количество целых чисел");
    }
}
