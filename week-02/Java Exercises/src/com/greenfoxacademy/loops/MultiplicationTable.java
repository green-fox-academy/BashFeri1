package com.greenfoxacademy.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please type a number: ");
        int number = reader.nextInt();

        for (int i = 1; i<11; i++) {
            System.out.println(i+" * "+number+" = "+i*number);
        }
    }
}
