package com.company.Lesson04.Task02;

public class Run {
    public static void main(String[] args) {

        Omnivores pig = new Omnivores("Rikky", "pink", "Medium", 3,120);
        Carnivores tiger = new Carnivores("Tommy", "orange", "Medium",6,75);
        Animals ship = new Herbivores("Dolly","white","litle", 2,40);

        pig.eat("apple");
        tiger.eat("pork");
        ship.eat("grass");

        System.out.println(ship.getHp());
        ship.sleep();
        System.out.println(ship.getHp());

        tiger.hunting(ship);


    }
}
