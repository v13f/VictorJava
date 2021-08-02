package com.company.Lesson01;

public class N1 {
    public static void main(String[] args) {

        int a = 7;

        if (a>0){
            System.out.print("число " + a + " положительное");
            if(a>0 && a<10) {
                System.out.println(" однозначное");
            } else  if (a>9 && a<100) {
                System.out.println(" двузначное");
            } else if (a>99 && a<1000){
                System.out.println(" трехзначное");
            }
        }else if (a<0){
            System.out.print("чмсло " + a + " отрицательное");
            if(a<0 && a>-10) {
                System.out.println(" однозначное");
            } else  if (a<-9 && a>-100) {
                System.out.println(" двузначное");
            } else if (a<-99 && a>-1000){
                System.out.println(" трехзначное");
            }
        }
    }
}
