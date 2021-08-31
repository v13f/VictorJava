package com.company.Lesson06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFormater {
    public Integer countWord(String s) {
        String[] words = s.trim().split("\\w+");
        return words.length;
    }

    public static boolean palindromeWord(String s) {
        Lecture lecture = new Lecture();
        String[] words = s.trim().split("\\W+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(lecture.reversString(words[i]))) {
                return true;
            }
        }
        return false;
    }

    public void task04(String s) throws FileNotFoundException {
        File file = new File("Task04.txt");
        PrintWriter pw = new PrintWriter(file);

        String[] txt = s.split("\\.");
        for (int i = 0; i < txt.length; i++) {

            if (countWord(txt[i]) >= 3 && countWord(txt[i]) <= 5) {
                pw.println(txt[i]);
                System.out.println("от 3 до 5");
            } else if (palindromeWord(txt[i])) {
                System.out.println(txt[i]);
                pw.println(txt[i]);
                System.out.println("палиндром");
            } else {
                System.out.println("ничего нету");
            }
        }
        pw.close();
    }
}