package com.company.Lesson05.Car;

import com.company.Lesson05.Car.Car.TaxCar;
import com.company.Lesson05.Practice.Task;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {


        Point point = new Point(45, 15);
        Task task = new Task();
        TaxCar[] taxCars = new TaxCar[6];

        taxCars[0] = new TaxCar(40, 5, 50, 6.1, "yellow", 5, 8000, 2.2f,180);
        taxCars[1] = new TaxCar(40, 5, 50, 5.9, "yellow", 5, 7600, 2.0f,160);
        taxCars[2] = new TaxCar(40, 5, 50, 6.2, "yellow", 5, 7000, 2.1f,176);
        taxCars[3] = new TaxCar(40, 5, 50, 4.0, "yellow", 5, 7800, 2.2f,173);
        taxCars[4] = new TaxCar(40, 5, 50, 5.6, "yellow", 5, 6900, 2.3f,150);
        taxCars[5] = new TaxCar(30, 5, 40, 5.0, "yellow", 5, 4000, 1.7f,130);

        Scanner scanner = new Scanner(System.in);
        String go, answer;
        while (true) {
            go = scanner.nextLine();
            switch (go) {
                case "game":
                    while (true) {
                        System.out.println("\n" + "p - задать конечный адресс" + "\n" + "pc - показать мое местоположение" +
                                "\n" + "с - посмотреть тариф" + "\n" + "d - поехать " + "\n" +
                                "cp - посмотреть тоимость поездки" + "\n" + "f - заправить машину" + "\n" + "s - послушать машину" + "\n" +
                                "$ - посмотеть стоимость машины" + "\n");
                        answer = scanner.nextLine();
                        switch (answer) {
                            case "p" -> taxCars[0].addPoint();
                            case "pc" -> taxCars[0].showPoint();
                            case "c" -> taxCars[0].getCost();
                            case "d" -> taxCars[0].start();
                            case "cp" -> taxCars[0].costPath();
                            case "f" -> taxCars[0].addFuel();
                            case "s" -> taxCars[0].sound();
                            case "$" -> taxCars[0].getPrice();
                        }
                    }
                case "costTC":
                    task.costTaxCar(taxCars);
                    break;
                case "minf":
                    task.fuel100TaxCar(taxCars);
                    break;
                case  "search":
                    task.searchSpeed(taxCars);
            }

        }
    }
}
