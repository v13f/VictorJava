package com.company.Lesson04.Task02;

public class Animals {
    private String name;
    private String color;
    private String size;
    private Integer age;
    private Integer weight;
    private Integer hp=100;

    public Animals(String name, String color, String size, Integer age, Integer weight) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getName() { return name; }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() { return weight; }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public void eat(String eatRandom) {
        System.out.println(name + " eat " + eatRandom);
    }

    public Integer sleep() {
        setHp(hp+10);
        return hp;
    }

    public void shit() {
        System.out.println(name + "Pof, pof, pof");
    }

}
