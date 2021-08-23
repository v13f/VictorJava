package com.company.Lesson05.Car;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(45, 15);

        System.out.println(point.startPoint());

        point.showPoint();

        System.out.println(point.addPoint());

        point.showPoint();

        System.out.println(point.addPoint());
        point.showPoint();


    }
}
