package com.greenfoxacademy.variables;

public class Cuboid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000
        double lenght = 5.1;
        double height = 3.1;
        double width = 2.5;

        double volume = lenght*height*width;
        double surface = 2*(lenght*height)+2*(lenght*width)+2*(height*width);

        System.out.println("Surface: "+(int)surface);
        System.out.println("Volume: "+(int)volume);
    }
}
