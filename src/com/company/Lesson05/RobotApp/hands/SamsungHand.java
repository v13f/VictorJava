package com.company.Lesson05.RobotApp.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Плавно поднял левую руку ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
