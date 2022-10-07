package com.abhay.practise;

import java.util.Scanner;

public class practise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Player 1 played ");
        String plyr1 = in.next();
        System.out.println("Player 2 played ");
        String plyr2 = in.next();

        if(plyr1.matches("Scissor")) {
            if(plyr2.matches( "Rock")) {
                System.out.println("Player 2 wins!");
            } else if(plyr2.matches( "Paper")) {
                System.out.println("Player 1 wins!");
            } else  {
                System.out.println("Play again!");
            }
        } else if (plyr1.matches( "Rock")) {
            if(plyr2.matches( "Scissor")) {
                System.out.println("Player 1 wins!");
            } else if(plyr2.matches( "Paper")) {
                System.out.println("Player 2 wins!");
            } else  {
                System.out.println("Play again!");
            }
        } else if (plyr1.matches( "Paper")) {
            if(plyr2.matches( "Scissor")) {
                System.out.println("Player 2 wins!");
            } else if(plyr2.matches( "Rock")) {
                System.out.println("Player 1 wins!");
            } else  {
                System.out.println("Play again!");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
