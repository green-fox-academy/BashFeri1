package com.greenfoxacademy.input;

import java.util.Scanner;

public class MileToKMConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter distance in miles: ");
        double miles = reader.nextDouble();

        double kilometers = miles*1.6;

        System.out.println("Distance converted to kilometers: "+kilometers);
    }
}
