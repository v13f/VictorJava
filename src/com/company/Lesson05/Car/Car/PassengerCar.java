package com.company.Lesson05.Car.Car;

public class PassengerCar extends Car {
    private int numberDoors;

    public PassengerCar(double fuel, int numberOfSeats, int tankCapacity, double fuel100, String color, int numberDoors, int price, int speed) {
        super(fuel, numberOfSeats, tankCapacity, fuel100, color, price, speed);
        this.numberDoors = numberDoors;
    }

    @Override
    public void sound() {
        System.out.println("Ви-ви-ви-ви-ви-ви-ви");
    }
}
