package com.company.Lesson03;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        int a = 0, c = 1;
        boolean itTrue = true;

        for (int i=0; i<arr.length; i++){
            arr[i]=random.nextInt(10);
        }

        for (int i : arr) {
            System.out.println(i);
        }

        while (itTrue) {

            if (arr[a] < arr[a + c]) {
                a++;
                if (a == arr.length - 1) {
                    c = 0;
                }
            }
            if (a == arr.length - 1) {
                System.out.println(" - массив с строго возрастающей последовательностью");
                break;
            } else {
                itTrue = false;
                System.out.println("- массив не последовательный");
            }
        }
    }
}
//        if (arr[0] < arr[1] & arr[1] < arr[2] & arr[2] < arr[3]) {
//            System.out.println(" - массив с строго возрастающей последовательностью");
//        }else
//            System.out.println("- массив не последовательный");
//        }


