package com.company.Lesson05.Wardrobe.Trousers;

public class Sweatpants implements ITrousers{

    @Override
    public void putOn() {
        System.out.println("Одел спортивные штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял спортивные штаны");
    }
}
