package com.company.Lesson05.Wardrobe.Jacket;

public class Shirt implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Одел рубашку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял рубашку");
    }
}
