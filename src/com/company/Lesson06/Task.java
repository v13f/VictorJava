package com.company.Lesson06;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static String stringAB(String str) {
        int a = str.indexOf("a");
        int b = str.lastIndexOf("b");
        if (a > b || a == -1 || b == -1) {
            return "no char";
        } else {
            return str.substring(a, b);
        }
    }

    public static String string3and0(String str) {
        char a = str.charAt(0);
        char b = str.charAt(3);
        str = str.replace(b, a);
        return b + str.substring(1, str.length() - 1);
    }

    public static void task03(String path) throws IOException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        Lecture stringR = new Lecture();

        File fileWriter = new File("Lesom.txt");
        PrintWriter pw = new PrintWriter(fileWriter);
        String str;
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            if (str.equals(stringR.reversString(str))) {
                System.out.println(str);
                pw.println(str);
            }
        }
        pw.close();
    }
}
