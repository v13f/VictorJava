package com.company.Lesson04.Task02;

//травоядные
public class Herbivores extends Animals {

    public Herbivores(String name, String color, String size, Integer age, Integer weight) {
        super(name, color, size, age, weight);
    }

    @Override
    public void eat(String grass) {
        System.out.println(getName()+ " eat " + grass);
    }
}

