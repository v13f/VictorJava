package com.company.Lesson07;

import java.util.Random;

public class Car {
    private String model;
    private Integer speed;
    private double cost;

    public Car(String model, Integer speed, double cost) {
        this.model = model;
        this.speed = speed;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void start () throws CustomException{
        Random random =new Random();
        int i=random.nextInt(20);
        if (i%2 == 0){
            throw new CustomException ("Авто: " + getModel() + " не завелось");
        } else
            System.out.println("Авто: " + getModel() + " завелось");
    }
}
