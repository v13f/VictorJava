package com.company.Lesson05.RobotApp.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Сделал прыжок \n");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
