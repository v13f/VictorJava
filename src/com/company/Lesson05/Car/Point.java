package com.company.Lesson05.Car;

import java.util.Scanner;

public class Point {
    int x;
    int y;
    int xx, yy;
    Scanner scanner = new Scanner(System.in);

    public Point(int xx, int yy) {
        this.x = xx;
        this.y = yy;
    }

    public int startPoint() {
        double res = Math.sqrt(x * x + y * y);
        return (int) res;
    }

    public int addPoint() {
        int xxx, yyy;
        double res;
        System.out.print("x: ");
        xx = scanner.nextInt();
        System.out.println(" ");
        System.out.print("Y: ");
        yy = scanner.nextInt();

        if (x < xx) {
            xxx = xx - x;
        } else if (x > xx) {
            xxx = x - xx;
        } else {
            xxx = x;
        }

        if (y < yy) {
            yyy = yy - y;
        } else if (y > yy) {
            yyy = y - yy;
        } else {
            yyy = y;
        }
        res = Math.sqrt(xxx * xxx + yyy * yyy);
        return (int) res;
    }

    public void showPoint() {
        if (yy != 0 || xx != 0) {
            System.out.println("x: " + xx + " y: " + yy );
        } else
            System.out.println("x: " + x + " y: " + y);
    }
}
