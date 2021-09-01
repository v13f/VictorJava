package com.company.Lesson06;

import java.io.File;
import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
//        String str = "Hello World";
//        //System.out.println(str.replace(str.charAt(3), str.charAt(0)));
//
//        StringBuilder strB = new StringBuilder("Hello World");
//
//        //System.out.println(strB.reverse());
//        StringBuilder strBuilder = new StringBuilder();
//        for (int x =  strB.length(); x == 0; x--){
//            strBuilder = strBuilder.append(strB.charAt(x));
//        }
//        System.out.println(strBuilder);
//
//         реверс
//        String string = "Hello World!";
//        System.out.println(Lecture.reversString(string));
//
//        заполнить ваесь стек
//        long l = 25678L;
//        Lecture.fullStack(l);
//
//        заполнить всю кучу
//        Lecture lecture = new Lecture();
//        lecture.fullHeap();

        String string = "Hello world, my name is Victor";

        //Task01
        System.out.println(Task.stringAB(string));

        //Task02
        System.out.println(Task.string3and0(string));

        //Task03
        String separator = File.separator;
        String path = separator + "Users" + separator + "user" + separator + "Desktop" + separator + "lesson06.txt";
        Task.task03(path);

        //Task04
        String txt = " Lorem Ipsum. is simply is. dummy text of. the printing ana. typesetting industry";
        TextFormater tx = new TextFormater();
        tx.task04(txt);
    }
}

