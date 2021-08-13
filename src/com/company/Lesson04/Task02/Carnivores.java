package com.company.Lesson04.Task02;

//хищники
public class Carnivores extends Animals {


    public Carnivores(String name, String color, String size, Integer age, Integer weight) {
        super(name, color, size, age, weight);
    }
//охота
    public void hunting(Animals victim){

        System.out.println(getName()+ " kill and eat " + victim.getName());
    }

    public void kill(String omnivores){
        System.out.println(getName() + " kill "+ omnivores);
    }

    @Override
    public void eat(String meat) {
        System.out.println(getName() + " eat " + meat);
    }
}
