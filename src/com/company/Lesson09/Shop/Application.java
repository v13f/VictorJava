package com.company.Lesson09.Shop;

import java.util.Scanner;

public class Application {

    public void start() {

        Product p1 = new Product(35, "чипсы", 4);
        Product p2 = new Product(12, "макароны", 7);
        Product p3 = new Product(34, "колбаса", 2);
        Product p4 = new Product(334, "сосиска", 1);
        Product p5 = new Product(344, "кортошка", 43);
        Product p6 = new Product(354, "котлета", 5);

        Shop shop = new Shop();

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);
        shop.addProduct(p4);
        shop.addProduct(p5);
        shop.addProduct(p6);
        shop.senIndexProduct();

        Scanner scr = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue) {

            System.out.println("\n'v' -Посмотреть весь товар \n'+' -Добавить товар \n'-' -Удалить товар по id " +
                    "\n'c' -Редактировать товар \n'x' -Закрыть программу ");
            String answer = scr.nextLine();

            switch (answer) {
                case "v":
                    System.out.println("Сортеровать по цене: \n 'u' - по возрастанию \n 'd' - по убыванию " +
                            "\n По добавлению: \n 'n' - сначала новые \n 's' - сначала старые");
                    String answ = scr.nextLine();
                    switch (answ) {
                        case "u":
                            shop.sortPriseUp();
                            break;
                        case "d":
                            shop.sortPriseDown();
                            break;
                        case "n":
                            shop.sortNew();
                            break;
                        case "s":
                            shop.sortOld();
                            break;
                    }
                    break;
                case "+":
                    System.out.print("\n Введите id: ");
                    int id = scr.nextInt();

                    System.out.print("\n Введите name: ");
                    String name = scr.nextLine();
                    name = scr.nextLine();

                    System.out.print("\n Введите price: ");
                    int price = scr.nextInt();

                    Product product = new Product(id, name, price);
                    shop.addProduct(product);
                    answer = scr.nextLine();
                    break;

                case "-":
                    System.out.println("\n Введите id товара который хотите удалить");
                    int idDel = scr.nextInt();
                    if (shop.indexId(idDel) == null) {
                        System.out.println("Продукта с таким id нет");
                        answer = scr.nextLine();
                        break;
                    }
                    shop.delete(shop.indexId(idDel));
                    break;

                case "c":
                    System.out.print("Введите id товара который хотите изменить: ");
                    int idC = scr.nextInt();
                    System.out.print("Введите новое имя: ");
                    String nameC = scr.nextLine();
                    nameC = scr.nextLine();
                    System.out.print("Введите новую цену: ");
                    int priceC = scr.nextInt();
                    shop.correctionProductId(idC, nameC, priceC);
                    answer = scr.nextLine();
                    break;
                case "x":
                    System.out.println("Уже уходите? \n'y' - да \n'n' - нет ");
                    String ansv = scr.nextLine();
                    switch (ansv) {
                        case "y":
                            isTrue = false;
                            break;
                        case "n":
                            break;
                    }


            }

        }
    }
}
