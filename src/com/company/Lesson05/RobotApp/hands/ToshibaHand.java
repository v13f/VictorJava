package com.company.Lesson05.RobotApp.hands;

public class ToshibaHand implements IHand{
    private  int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Резко поднял 2 руки");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
