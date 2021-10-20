package com.greenfoxacademy.input;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        System.out.print("Please enter first number: ");
        sum+= reader.nextInt();
        System.out.print("Please enter second number: ");
        sum+= reader.nextInt();
        System.out.print("Please enter third number: ");
        sum+= reader.nextInt();
        System.out.print("Please enter fourth number: ");
        sum+= reader.nextInt();
        System.out.print("Please enter fifth number: ");
        sum+= reader.nextInt();

        System.out.println("Sum: "+sum+", Average: "+(double)sum/5);


    }
}
