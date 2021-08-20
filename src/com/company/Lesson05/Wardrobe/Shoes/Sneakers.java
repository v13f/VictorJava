package com.company.Lesson05.Wardrobe.Shoes;

public class Sneakers implements  IShoes{
    @Override
    public void putOn() {
        System.out.println("Надел кроссовки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял кроссовки ");
    }
}
