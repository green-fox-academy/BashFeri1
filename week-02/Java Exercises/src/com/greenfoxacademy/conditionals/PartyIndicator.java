package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party
        Scanner reader = new Scanner(System.in);

        System.out.print("Number of girls coming to the party: ");
        int girls = reader.nextInt();

        System.out.print("Number of boys coming to the party: ");
        int boys = reader.nextInt();

        int total= boys+girls;

        if(total>20 && boys==girls) {
            System.out.println("This party is outstanding!");
        } else if(girls<1) {
            System.out.println("Sausage Fest");
        } else if (total<20) {
            System.out.println("Its OK I guess...");
        } else if (total>20 && boys!=girls) {
            System.out.println("This party is pretty GOoOd");
        }
    }
}
