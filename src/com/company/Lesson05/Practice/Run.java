package com.company.Lesson05.Practice;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        int x, y;

        Car car1 = new Car(6.0f, 180, 7000, 60f);

        Scanner scanner = new Scanner(System.in);
        System.out.println("p - ввести координаты для поездки");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        Point point = new Point(x, y);

        while (true) {
            System.out.println(car1.getFuel());
            System.out.println("Выберите действие: ");

            System.out.println("d - ехать");
            System.out.println("f - посмотреть топлево");
            System.out.println("+ - Добавить новую точку");

            String choice = scanner.nextLine();


            switch (choice) {
                case "f":
                    System.out.println(car1.getFuel());
                    break;
                case "d":
                    car1.drive(point);
                    break;
                case "+":


            }
        }
    }
}