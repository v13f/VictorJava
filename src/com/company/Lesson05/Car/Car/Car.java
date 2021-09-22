package com.company.Lesson05.Car.Car;

import com.company.Lesson05.Car.Point;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {
    private double fuel;
    private int numberOfSeats;
    private int tankCapacity;
    private double fuel100;
    private float price;
    private int speed;
    String color;

    public Car() {    }

    int x, y;
    Scanner scanner = new Scanner(System.in);
    Point point = new Point(x, y);

    DecimalFormat df = new DecimalFormat("##.##");

    public Car(double fuel, int numberOfSeats, int tankCapacity, double fuel100, String color, int price, int speed) {
        this.fuel = fuel;
        this.numberOfSeats = numberOfSeats;
        this.tankCapacity = tankCapacity;
        this.fuel100 = fuel100;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void sound() {
        System.out.println("Пр-пр-пр-пр-пр-пр");
    }

    public void addPoint() {
        point.addPoint();
    }

    public void addFuel(){
        fuel = tankCapacity;
    }

    public double getFuel100() {
        return fuel100;
    }

    public void setFuel100(double fuel100) {
        this.fuel100 = fuel100;
    }

    public void showPoint(){
        point.showPoint();
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

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        System.out.println("Цена авто: "+ df.format(price) + " $");
        return price;
    }

    @Override
    public String toString() {
        return "Car " +
                "fuel: " + fuel +
                ", numberOfSeats = " + numberOfSeats +
                ", tankCapacity = " + tankCapacity +
                ", fuel100 = " + fuel100 +
                ", price = " + price +
                ", color = " + color;
    }
}
