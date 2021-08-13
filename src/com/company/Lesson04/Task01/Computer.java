package com.company.Lesson04.Task01;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    Integer ram;
    Integer hardDrive;
    Integer resourceFullCycles;
    private int num;
    private boolean isTrue = true;
    private boolean on = false;
    private boolean off =true;

    public Computer(String processor, Integer ram, Integer hardDrive, Integer resourceFullCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resourceFullCycles = resourceFullCycles;
    }

    @Override
    public String toString() {
        return "Computer " + "\n" +
                "Processor: " + processor + "\n" +
                "RAM: " + ram + "\n" +
                "Hard drive: " + hardDrive + "\n" +
                "Resource of full work cycles: " + resourceFullCycles;
    }

    public void computerOn() {
        if (isTrue&&off) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int numComp, numPerson;
            numComp = random.nextInt(2);

            System.out.println("ON" + "\n" + "Enter 0 or 1 " + numComp);
            numPerson = scanner.nextInt();
            if (numPerson >= 0 && numPerson < 2) {
                if (numComp == numPerson) {
                    System.out.println("Computer on");
                    off = false;
                    on=true;
                } else if (numComp != numPerson) {
                    System.out.println("Computer is fire");
                }
            } else {
                System.out.println("Number enter not correction");
            }
        }
    }

    public void computerOff() {
        if (isTrue&&on) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int numComp, numPerson;
            numComp = random.nextInt(2);

            System.out.println("OFF" + "\n" + "Enter 0 or 1 " + numComp);
            numPerson = scanner.nextInt();
            if (numPerson >= 0 && numPerson < 2) {
                if (numComp == numPerson) {
                    System.out.println("Computer off");
                    on = false;
                    off = true;
                    this.num += 1;
                } else if (numComp != numPerson) {
                    System.out.println("Computer is fire");
                }
            } else {
                System.out.println("Number enter not correction");
            }
        }
    }

    public void computerFire() {
        if (this.resourceFullCycles <= this.num) {
            System.out.println("Is computer fire");
            this.isTrue = false;
        }
    }
}
