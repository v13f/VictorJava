package com.company.Lesson05.Wardrobe.Trousers;

public class Jeans implements ITrousers{
    @Override
    public void putOn() {
        System.out.println("Одел джинсы");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял джинсы");
    }
}
