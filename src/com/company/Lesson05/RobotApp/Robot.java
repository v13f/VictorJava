package com.company.Lesson05.RobotApp;
import com.company.Lesson05.RobotApp.hands.IHand;
import com.company.Lesson05.RobotApp.heads.IHead;
import com.company.Lesson05.RobotApp.legs.ILeg;


public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        System.out.println(getPrice());
        head.speak();
        hand.upHand();
        leg.step();

    }

    /**
     * Get the cost of a robot
     * @return int
     */

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }



}
