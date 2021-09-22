package com.company.Lesson03.TicTak;

import java.util.Scanner;

public class XO {
    private int x, y;
    private int size = 3;
    String[][] field = new String[size][size];
    Scanner scanner = new Scanner(System.in);

    public void newGame() {
        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z < field.length; z++) {
                field[i][z] = "[ ]";
            }
        }
    }

    public void showField() {
        for (int i = 0; i < field.length; i++) {
            System.out.println("");
            for (int z = 0; z < field.length; z++) {
                System.out.print(field[i][z]);
            }
        }
        System.out.println("");

    }

    public void put(Person answer) {
        if (field[y][x] == "[ ]") {
            field[y][x] = "[" + answer.answer + "]";
        } else {
            System.out.println("эта ячейка занята");
            enterAnswer(answer);
            put(answer);
        }
    }

    public void check(Person person) {
        for (int i = 0; i < field.length; i++) {
            for (int z = 0; z< field.length; z++)
            if (field[i][z] == field[1][1]&& field[1][1] == field[2][2] && field[0][0] != "[ ]") {
                System.out.println("Победа " + person.answer);
            }
        }
        }

    public void enterAnswer(Person person) {
        System.out.print("x: ");
        x = scanner.nextInt() - 1;
        System.out.print("y: ");
        y = scanner.nextInt() - 1;
    }

    public void gameTicTak(Person person) {
        enterAnswer(person);
        put(person);
        showField();
       check(person);



    }


}