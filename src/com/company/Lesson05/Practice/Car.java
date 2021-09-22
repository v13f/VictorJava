package com.company.Lesson05.Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {

    private float fuelConsumption100;
    private float fuel;
    private int speed;
    private int price;

    private Point carPosition = new Point(0, 0);

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##.##");

    public Car(float fuelConsumption100, int speed, int price, float fuel) {
        this.fuelConsumption100 = fuelConsumption100;
        this.speed = speed;
        this.price = price;
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    //расчет 1 литер топлево на км
    double getFuelConsumptionOneFuel() {
        float res = (float) 100 / fuelConsumption100;
        return res;

    }

    //расчет топлева на определенный отрезок
    public double getFuelConsumption(Point point) {
        float res = (point.setDistance() / (float) 100) * fuelConsumption100;
        if (fuel > res) {
            System.out.println("авто проехало " + point.setDistance() + " и израсходовало " + df.format(res) + " л. топлева");
        } else {
            System.out.println("Авто проехало " + df.format(getFuelConsumptionOneFuel() * fuel) + ", бензин закончился");
        }
        return res;
    }

    // посмотреть топлево
    public float getFuel() {
        return fuel;
    }

    public float getFuelConsumption100() {
        return fuelConsumption100;
    }

    //ехать
    public void drive(Point pointDestination) {
        if (fuel > getFuelConsumption(pointDestination)) {
            fuel -= getFuelConsumption(pointDestination);
        } else {
            System.out.println("Бензин закончился");
        }

    }

    public int newPoint(int x, int y){

        System.out.println("p - ввести координаты для поездки");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        Point point = new Point(x, y);
       return point.setDistance();
    }

    //тормоз
    public void braking() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelConsumption100=" + fuelConsumption100 +
                ", fuel=" + fuel +
                ", speed=" + speed +
                ", price=" + price +
                ", carPosition=" + carPosition +
                '}';
    }
}
