package com.abhay.javabasics;

import java.util.Scanner;

public class Basics_02_UserInput {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Sum of " + num1 + " and " + num2 +" is " + (num1+num2));
    }
}
