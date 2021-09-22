package com.company.Lesson03.TicTak;

public class Run {
    public static void main(String[] args) {


        Person xxx = new Person("x");
        Person ooo = new Person("o");

        XO xo = new XO ();
        xo.newGame();
        while (true){
            xo.gameTicTak(xxx);
            xo.gameTicTak(ooo);
        }




    }
}
