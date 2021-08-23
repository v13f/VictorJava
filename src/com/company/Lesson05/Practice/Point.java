package com.company.Lesson05.Practice;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int setDistance (){
        double distance= x*x + y*y;
        distance = Math.sqrt(distance);
        return (int) distance;
    }
}
