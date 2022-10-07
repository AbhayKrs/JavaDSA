package com.abhay.practise;

import java.util.Scanner;

public class practise2 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);

        System.out.println("Enter the marks of 3 subjects: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();

        if(num1>100 || num2>100 || num3>100 || num1<0 || num2<0 || num3<0) {
            System.out.println("Invalid Marks");
        } else {
            float cgpa = (num1+num2+num3)/300 * 10;
            System.out.println(cgpa);
        }
    }
}
