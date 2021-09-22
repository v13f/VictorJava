package com.company.Lesson05.RobotApp.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }


    @Override
    public void speak() {
        System.out.println("Голова говорит Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

