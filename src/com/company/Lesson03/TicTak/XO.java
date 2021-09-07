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

//                field[1][1] = "[O]";
//                field[2][2] = "[O]";
//                field[0][0] = "[O]";
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

    public boolean check(Person person) {
        if (checkMainDiagonal(person)) {
            return true;
        }
        return false;
    }

    int res;

    public boolean checkMainDiagonal(Person person) {
        int z = 1;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == field[z][z] && field[i][i] != "[ ]") {
                z++;
                res++;
            }
            break;
        }
        if (res == field.length - 1) {
            System.out.println("Игрок: " + person.answer + " - победил");
            return true;
        }
        res = 0;
        return false;
    }

    public void enterAnswer(Person person) {
        System.out.println("Ход: " + person.answer);
        System.out.print("x: ");
        x = scanner.nextInt() - 1;
        System.out.print("y: ");
        y = scanner.nextInt() - 1;
    }

    public void gameTicTak(Person person) {
        do {
            enterAnswer(person);
            put(person);
            showField();
        } while (check(person));
    }


}