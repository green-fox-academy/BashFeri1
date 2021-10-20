package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class PrintBigger {
    // Írj egy programot, ami két számot kér a standard input-ból
    // és kiírja a nagyobbat
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please type first number: ");
        int biggestNumber = reader.nextInt();

        System.out.print("Please type second number: ");
        int secondNumber = reader.nextInt();

        if(secondNumber>biggestNumber) {
            biggestNumber=secondNumber;
        }

        System.out.print("Biggest of the two is: "+biggestNumber);
    }
}
