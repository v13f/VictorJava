package com.company.Lesson_6;

import com.company.Lesson05.Car.Car.Car;

public final class Lecture {
    public String reversString (String str){
        if (str.length()==0){
            return "";
        }
        return str.substring(str.length()-1) + reversString(str.substring(0,str.length()-1));
    }

    public static long fullStack(Long l){
        return l *= l + fullStack(l);
    }

    Car [] cars = new Car[100000000];
    public void fullHeap() {
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(12, 32, 1 + i, 32, "yellow");
        }
    }
}
