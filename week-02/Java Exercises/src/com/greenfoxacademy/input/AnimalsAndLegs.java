package com.greenfoxacademy.input;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the number of livestock the farmer has!\nHens: ");
        int hens= reader.nextInt();

        System.out.print("Swine: ");
        int swine= reader.nextInt();

        int legs = hens*2 + swine*4;

        System.out.println("\nThe total number of livestock legs on the farm is " + legs);
    }
}
