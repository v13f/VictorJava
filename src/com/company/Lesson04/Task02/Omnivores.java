package com.company.Lesson04.Task02;

import java.util.SplittableRandom;

//всеядные
public class Omnivores extends Animals{

    public Omnivores(String name, String color, String size, Integer age, Integer weight) {
        super(name, color, size, age, weight);
    }


    @Override
    public void eat(String eatRandom) {
        super.eat(eatRandom);
    }
}

