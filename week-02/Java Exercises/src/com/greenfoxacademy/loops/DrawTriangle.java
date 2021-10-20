package com.greenfoxacademy.loops;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please type a number: ");
        int lineCount = reader.nextInt();

        for (int i = 0; i<lineCount;i++) {
            for (int j = 0; j<=i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
