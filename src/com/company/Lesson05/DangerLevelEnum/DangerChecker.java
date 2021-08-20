package com.company.Lesson05.DangerLevelEnum;

import java.util.Random;

public class DangerChecker {
    public static void check(){
        int i = 0;
        while (i<10){
            i++;
            dangerLevel();
            System.out.println(i);

        }
    }
    public static DangerLevel dangerLevel (){
        Random random = new Random(100);
            int num = random.nextInt();
            if (num < 30 ) {
                return DangerLevel.LOW;
            }else {
                return num>30 && num < 60 ? DangerLevel.MEDIUM : DangerLevel.HIGH;
            }

    }

    public static void main(String[] args) {
        check();
    }
}
