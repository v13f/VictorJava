package com.company.Lesson05.Wardrobe;

import com.company.Lesson05.Wardrobe.Jacket.IJacket;
import com.company.Lesson05.Wardrobe.Shoes.IShoes;
import com.company.Lesson05.Wardrobe.Trousers.ITrousers;

public class Person implements ITrousers,IJacket, IShoes {
    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;

    public IJacket getJacket() {
        return jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public Person(String name, IJacket jacket, IShoes shoes, ITrousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    @Override
    public void putOn() {
        getJacket().putOn();
        getShoes().putOn();
        getTrousers().putOn();
    }

    @Override
    public void takeOff() {
        getTrousers().takeOff();
        getJacket().takeOff();
        getShoes().takeOff();
    }
}
