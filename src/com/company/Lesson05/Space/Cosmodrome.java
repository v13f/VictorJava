package com.company.Lesson05.Space;

public class Cosmodrome {



    public void go(IStart start) {
        if (start.systemCheck()){
            start.startingEngines();
            start.start();
        }

    }
}