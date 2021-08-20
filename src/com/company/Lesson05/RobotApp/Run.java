package com.company.Lesson05.RobotApp;

import com.company.Lesson05.RobotApp.hands.SamsungHand;
import com.company.Lesson05.RobotApp.hands.SonyHand;
import com.company.Lesson05.RobotApp.hands.ToshibaHand;
import com.company.Lesson05.RobotApp.heads.SamsungHead;
import com.company.Lesson05.RobotApp.heads.SonyHead;
import com.company.Lesson05.RobotApp.heads.ToshibaHead;
import com.company.Lesson05.RobotApp.legs.SamsungLeg;
import com.company.Lesson05.RobotApp.legs.SonyLeg;
import com.company.Lesson05.RobotApp.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        SamsungHand samsungHand = new SamsungHand(2000);
        SamsungHead samsungHead = new SamsungHead(5000);
        SamsungLeg samsungLeg = new SamsungLeg(3000);

        SonyHand sonyHand = new SonyHand(2500);
        SonyHead sonyHead = new SonyHead(4500);
        SonyLeg sonyLeg = new SonyLeg(3500);

        ToshibaHand toshibaHand = new ToshibaHand(1500);
        ToshibaHead toshibaHead = new ToshibaHead(3000);
        ToshibaLeg toshibaLeg = new ToshibaLeg(1000);

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot[] robots = new Robot[3];
        robots[0] = new Robot(samsungHead, sonyHand, samsungLeg);
        robots[1] = new Robot(toshibaHead, samsungHand, toshibaLeg);
        robots[2] = new Robot(sonyHead, toshibaHand, sonyLeg);

        for (Robot robot : robots) robot.action();

        int prisemax = 0;
        int robotMax=0;

        for (int i = 0; i < robots.length; i++) {
            robots[i].getPrice();
            if (robots[i].getPrice() > prisemax){
                prisemax = robots[i].getPrice();
            robotMax = i+1;}
        }
        System.out.println("Робот " + robotMax + " самый дорогой, он стоит: " + prisemax + "$" );
    }
}
