package com.company.Lesson03;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] first = new int[5];
        int[] second = new int[5];

        float resFirst = 0, resSecond = 0;

        for (int i = 0; i < 5; i++) {
            first[i] = random.nextInt(15);
            second[i] = random.nextInt(15);
        }
        System.out.print("First: ");
        for (int i : first) {
            System.out.print(i + " ");
        }

        for (float i : first) {
            resFirst += i;
        }
        resFirst /= 5;

        System.out.println(" - average value: " + resFirst);

        System.out.print("Second: ");
        for (int i : second) {
            System.out.print(i + " ");
        }
        for (int i : second) {
            resSecond += i;
        }
        resSecond /= 5;
        System.out.println(" - average value: " + resSecond);

        if (resFirst > resSecond) {
            System.out.println("first is bigger");
        } else if (resFirst == resSecond) {
            System.out.println("they are equal");
        } else {
            System.out.println("second is bigger");
        }


    }
}
