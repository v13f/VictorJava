package com.company.Lesson05.Car.Car;

import com.company.Lesson05.Car.Point;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {
    private double fuel;
    private int numberOfSeats;
    private int tankCapacity;
    private double fuel100;
    String color;

    int x, y;
    Scanner scanner = new Scanner(System.in);
    Point point = new Point(x, y);

    DecimalFormat df = new DecimalFormat("##.##");

    public Car(double fuel, int numberOfSeats, int tankCapacity, double fuel100, String color) {
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.tankCapacity = tankCapacity;
        this.fuel100 = fuel100;
        this.color = color;
    }

    public void addPoint() {
        point.addPoint();
    }

    public void start() {
        if (fuel != 0) {
            double res = point.getPath() / 100 * fuel100;
            if (res < fuel) {
                fuel -= res;
                System.out.println("Вы проехали " + df.format(point.getPath()) +
                        " км, израсходовав " + df.format(res) + " л. топлева");
            } else {
                double res2 = fuel / fuel100 * 100;
                fuel = 0;
                System.out.println("Топлево закончилось, вы смогли проехать " + df.format(res2) + " км");
            }
        } else {
            System.out.println("Ваш бак пуст!");
        }
    }

    public double getFuel() {
        System.out.println("В баке " + df.format(fuel) + " л. топлева");
        return fuel;
    }
}
