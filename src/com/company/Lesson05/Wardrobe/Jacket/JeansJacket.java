package com.company.Lesson05.Wardrobe.Jacket;

public class JeansJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надел джинцовку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял джинцовку");
    }
}
