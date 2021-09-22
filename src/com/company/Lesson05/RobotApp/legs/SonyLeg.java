package com.company.Lesson05.RobotApp.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Начал танцевать \n" );
    }

    @Override
    public int getPrice() {
        return price;
    }
}
