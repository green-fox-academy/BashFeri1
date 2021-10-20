package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
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
