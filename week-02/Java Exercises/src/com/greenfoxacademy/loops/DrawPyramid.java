package com.greenfoxacademy.loops;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen piramist rajzol:
//
//
//    *
//   ***
//  *****
// *******
//
// A piramisnak annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke
        Scanner reader = new Scanner(System.in);
        System.out.print("How many tall should the pyramid be: ");
        int lineCount = reader.nextInt();
        int starsToPrint = 1;

        for (int i = 0; i<lineCount; i++) {

            for (int j = lineCount-1; j>i; j--) {
                System.out.print(" ");
            }

            for (int l = 0; l<starsToPrint; l++) {
                System.out.print("*");
            }

            System.out.println();

            starsToPrint+=2;
        }
    }
}
