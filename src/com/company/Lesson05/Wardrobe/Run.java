package com.company.Lesson05.Wardrobe;

import com.company.Lesson05.Wardrobe.Jacket.JeansJacket;
import com.company.Lesson05.Wardrobe.Jacket.Shirt;
import com.company.Lesson05.Wardrobe.Shoes.Slippers;
import com.company.Lesson05.Wardrobe.Shoes.Sneakers;
import com.company.Lesson05.Wardrobe.Trousers.Jeans;
import com.company.Lesson05.Wardrobe.Trousers.Sweatpants;

public class Run {
    public static void main(String[] args) {

        // Jacket
        JeansJacket jeansJacket = new JeansJacket();
        Shirt shirt = new Shirt();

        //Shoes
        Slippers slippers = new Slippers();
        Sneakers sneakers = new Sneakers();

        //Trousers
        Jeans jeans = new Jeans();
        Sweatpants sweatpants = new Sweatpants();

        Person [] person = new Person[2];

        person[0] = new Person("Pasha",jeansJacket,sneakers,jeans);
        person[1] = new Person("Vlad", shirt,slippers,sweatpants);

        person[0].putOn();

        person[1].takeOff();
    }
}
