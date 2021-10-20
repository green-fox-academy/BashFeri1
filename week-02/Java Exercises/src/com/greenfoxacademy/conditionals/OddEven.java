package com.greenfoxacademy.conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = reader.nextInt();

        if(input%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
