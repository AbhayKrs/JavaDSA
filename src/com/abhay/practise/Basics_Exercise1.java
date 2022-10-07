package com.abhay.practise;

import java.util.Scanner;

public class Basics_Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks in 5 subjects: ");
        float m1 = in.nextFloat();
        float m2 = in.nextFloat();
        float m3 = in.nextFloat();
        float m4 = in.nextFloat();
        float m5 = in.nextFloat();

        if(m1 > 100 && m2 > 100 && m3 > 100 && m4 > 100 && m5 > 100) {
            System.out.println("Invalid marks input, marks must be below 100");
        } else if (m1 < 0 && m2 < 0 && m3 < 0 && m4 < 0 && m5 < 0) {
            System.out.println("Invalid marks input, marks must be above 0");
        } else {
            float percentage = ((m1+m2+m3+m4+m5)/500) * 100;
            System.out.println("Percentage: " + percentage);
        }
    }
}
