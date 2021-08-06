package com.company.Lesson02;

public class Task01 {
    public static void main(String[] args) {

        int day;
        float km = 10f, km7day=0f;

        for (day = 1; day <= 7; day++){
            km7day += km;
            km += km * 0.10;
            if (day == 7)
                System.out.println(km7day);

        }
    }
}