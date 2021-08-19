package com.company.Lesson05.RobotApp.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Прошел 5 шагов \n");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
