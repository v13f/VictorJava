package com.company.Lesson07;

public class Run {
    public static void main(String[] args) {
        Car [] cars = new Car[4];

        cars[0] = new Car("Opel",180,5600);
        cars[1] = new Car("Mazda",190,9000);
        cars[2] = new Car("BMW",260,16000);
        cars[3] = new Car("Audi",250,15600);

        for (int i = 0; i < cars.length; i++){
            try {
                cars[i].start();
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
        }
    }

