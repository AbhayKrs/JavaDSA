package com.abhay.practise;
import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, sum = 0;
        System.out.println("Enter three numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        sum = num1 + num2 + num3;
        System.out.println("Sum of the three numbers: "+ sum);
    }
}
