package com.greenfoxacademy.loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please type first number: ");
        int first = reader.nextInt();

        System.out.print("Please type second number: ");
        int second = reader.nextInt();

        if (second>first) {
            for (int i = first; i<second; i++ ){
                System.out.println(i);
            }
        } else {
            System.out.println("Second number has to be bigger!");
        }
    }
}
