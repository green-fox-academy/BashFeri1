package com.greenfoxacademy.input;

import java.util.Scanner;

public class MileToKMConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter distance in miles: ");
        double miles = reader.nextDouble();

        double kilometers = miles*1.6;

        System.out.println("Distance converted to kilometers: "+kilometers);
    }
}
