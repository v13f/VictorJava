package com.company.Lesson05.Practice;

import com.company.Lesson05.Car.Car.TaxCar;

import java.util.Scanner;

public class Task {
    Scanner scanner = new Scanner(System.in);

    public float costTaxCar(TaxCar[] taxCars) {
        float pricesTaxCar = 0;
        for (int i = 0; i < taxCars.length; i++) {
            pricesTaxCar += taxCars[i].getPrice();
        }
        System.out.println("Стоимость всех авто: " + pricesTaxCar);
        return pricesTaxCar;
    }

    int a = 0;

    public void fuel100TaxCar(TaxCar[] taxCars) {
        double res = 10D;
        int x = 0;
        for (int i = 0; i < taxCars.length; i++) {
            if (res > taxCars[i].getFuel100() && taxCars[i].getFuel100() != 0) {
                res = taxCars[i].getFuel100();
                x = i;
            }
        }
        System.out.println(taxCars[x].toString());
        taxCars[x].setFuel100(0);
        if (a < taxCars.length-1) {
            a++;
            fuel100TaxCar(taxCars);
        }
    }
    public void searchSpeed(TaxCar[] taxCars) {
        System.out.println("Введите скороть для поиска: ");
        int a = scanner.nextInt();
        int x= taxCars.length+1;
        for (int i = 0; i < taxCars.length; i++) {
            if (a == taxCars[i].getSpeed()){
              x = i;
            }
        }
        if (x != taxCars.length+1){
            System.out.println(taxCars[x].toString());
        }else{
            System.out.println("Машины с таким параметром скоросит нет");
    }}
}
