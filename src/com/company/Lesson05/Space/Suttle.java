package com.company.Lesson05.Space;

import java.util.Random;

public class Suttle extends Cosmodrome  implements IStart {
    private String name;


    @Override
    public boolean systemCheck() {
        int i;
        Random random = new Random();
        i = random.nextInt(10);
        if (i > 3) {
            System.out.println("Проверка прошла успешно!!!");
            return true;
        } else {
            System.out.println("Проверка потерпела неудачу!!!");
            return false;
        }
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели шатла запущены!!! \nВсе системы в норме!!!");

    }

    @Override
    public void start() {
        int i =3;
        while (i>0) {
            try {
                System.out.println(i);
                i--;
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                System.out.println("Старт шатла!");
    }
}
