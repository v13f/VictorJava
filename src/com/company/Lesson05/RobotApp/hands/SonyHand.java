package com.company.Lesson05.RobotApp.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Красиво поднял левую руку");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
