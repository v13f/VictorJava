package com.company.Lesson07;

public class CustomException extends Exception{
    static String s1 = "by Victor";
    public CustomException(String s) {
        super(s1 + s);
    }
}
