package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class OneTwoALot {
    // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
    // Ha a szám kisebb vagy egyenlő 0-val, írja ki, hogy: "Nem elég"
    // Ha a szám egyenlő 1-gyel, írja ki, hogy: "Egy"
    // Ha a szám egyenlő 2-vel, írja ki, hogy: "Kettő"
    // Ha a szám nagyobb, mint 2, írja ki, hogy: "Sok"
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please type a number: ");
        int number = reader.nextInt();

        if(number<=0) {
            System.out.println("Not enough");
        } else if (number==1) {
            System.out.println("One");
        } else if (number==2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
