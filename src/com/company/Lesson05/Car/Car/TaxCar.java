package com.company.Lesson05.Car.Car;

import java.text.DecimalFormat;

public class TaxCar extends PassengerCar {
    private float cost;

    DecimalFormat decimalFormat =new DecimalFormat("#.##");

    public TaxCar(double fuel, int numberOfSeats, int tankCapacity, double fuel100, String color, int numberDoors, int price, float cost, int speed) {
        super(fuel, numberOfSeats, tankCapacity, fuel100, color, numberDoors, price, speed);
        this.cost = cost;
    }

    @Override
    public void start() {
        super.start();
        setPrice((float) (getPrice() - (point.getPath() * 0.01)));
    }

    public float getCost() {
        System.out.println("Ценна за 1 км: "+decimalFormat.format(cost) + " $");
        return cost;
    }

    public float costPath(){
        float price = (float) (point.getPath()*cost);
        System.out.println("стоимость поездки "+decimalFormat.format(price) + " $");
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
