package com.company.Lesson09.Shop;

import java.util.Scanner;

public class Application {

    public void start (){

        Product p1 = new Product(35, "чипсы", 4);
        Product p2 = new Product(12, "макароны", 5);
        Product p3 = new Product(34, "колбаса", 2);

        Shop shop = new Shop();

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);


        Scanner scr = new Scanner(System.in);

        while (true) {

            System.out.println("Посмотреть весь товар - 'v' \nДобавить товар - '+'");
            String answer = scr.nextLine();

            switch (answer) {
                case "v":
                    System.out.println("Сортеровать по цене: \n u - по возрастанию \n d - по убыванию");
                    String answ = scr.nextLine();
                    switch (answ) {
                        case "u":
                            shop.sortPriseUp();
                            break;
                        case "d":
                            shop.sortPriseDown();
                            break;
                    }
                    break;
                case "+":
                    System.out.print("\n Введите id: ");
                    int id = scr.nextInt();

                    System.out.print("\n Введите name: ");
                    String name = scr.nextLine();

                    System.out.print("\n Введите price: ");
                    int price = scr.nextInt();

                    Product product = new Product(id, name, price);
                    shop.addProduct(product);

            }
        }
    }
}
