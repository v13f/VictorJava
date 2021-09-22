package com.company.Lesson04.Task01;

public class Run {
    public static void main(String[] args) {
        int i = 0;
        Computer computer = new Computer("intel", 16, 1000, 10);

        System.out.println(computer);

        computer.computerOn();
        computer.computerOff();
        computer.computerFire();
    }
}
