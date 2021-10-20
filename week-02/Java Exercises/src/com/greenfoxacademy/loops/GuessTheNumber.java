package com.greenfoxacademy.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot
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
