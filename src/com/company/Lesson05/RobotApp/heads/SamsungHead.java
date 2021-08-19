package com.company.Lesson05.RobotApp.heads;

import javax.sound.midi.Soundbank;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }


    @Override
    public void speak() {
        System.out.println("Голова говорит Samsung");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
