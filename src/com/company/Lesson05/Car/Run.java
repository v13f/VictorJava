package com.company.Lesson05.Car;

import com.company.Lesson05.Car.Car.Car;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(45, 15);

        Car car = new Car(40,50,6.5,"Blue");

        car.getFuel();
        car.addPoint();
        car.start();
        car.getFuel();

    }
}
