package com.greenfoxacademy.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberToGuess = 55;

        while (2>1) {
            System.out.print("Guess number: ");
            int guess = reader.nextInt();

            if(guess==numberToGuess) {
                System.out.println("Spot on! You get nothing. This game has 0 replay value");
                break;
            } else if (guess>numberToGuess) {
                System.out.println("Try a smaller number");
            } else {
                System.out.println("Try a bigger number");
            }
        }
    }
}
