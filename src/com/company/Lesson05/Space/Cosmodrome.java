package com.company.Lesson05.Space;

public class Cosmodrome implements IStart {

    boolean isTrue;
    int x = 0;

    void start(int num) {
        systemCheck();
    }

    @Override
    public boolean systemCheck() {
        return false;
    }

    @Override
    public void startingEngines() {

    }

    @Override
    public void start() {

    }
}
