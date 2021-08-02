package com.company.Lesson02;

import java.text.DecimalFormat;

public class N5 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###.##");

        int sm = 1;
        float inch = 2.54f, inchRes=0;
        while (sm<=20){
            inchRes += inch;
            System.out.println(sm + " см = "+ df.format(inchRes) + " дюйм");
            sm++;
        }
    }
}
