package com.company.Lesson03.TicTak;

public class Run {
    public static void main(String[] args) {


        Person xxx = new Person("X");
        Person ooo = new Person("O");

        XO xo = new XO ();
        xo.newGame();
        while (true){
            xo.gameTicTak(xxx);
            xo.gameTicTak(ooo);
        }




    }
}
