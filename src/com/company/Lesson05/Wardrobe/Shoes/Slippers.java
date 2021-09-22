package com.company.Lesson05.Wardrobe.Shoes;

public class Slippers implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надел тапочки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял тапочки");
    }
}
