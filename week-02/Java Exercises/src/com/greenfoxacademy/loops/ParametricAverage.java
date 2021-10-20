package com.greenfoxacademy.loops;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please type the number of inputs you wish to enter: ");
        int numberOfInputs = reader.nextInt();
        int sumOfInput= 0;

        for (int i = 0; i<numberOfInputs; i++) {
            System.out.print("Please type number: ");
            int userInput = reader.nextInt();
            sumOfInput+=userInput;
        }

        System.out.print("Sum: "+sumOfInput+", Average: "+(float)sumOfInput/numberOfInputs);
    }
}
