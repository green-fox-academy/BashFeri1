package com.greenfoxacademy.loops;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please type the number of rows for diamond: ");
        int rows = reader.nextInt();
        int starsToPrint = 1;
        int spacesToPrint = rows-1;

//      Printing top part
        for (int i = 0; i<rows; i++) {
            if (starsToPrint<=rows) {
                for (int j = spacesToPrint; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int l = 0; l < starsToPrint; l++) {
                    System.out.print("*");
                }
                System.out.println();
                starsToPrint += 2;
                spacesToPrint-=1;
            }
        }
        starsToPrint-=2;
        spacesToPrint+=1;

        //print bottom part
        while (starsToPrint>0) {
            for (int j = 0; j<=spacesToPrint; j++) {
                System.out.print(" ");
            }

            for (int l = 0; l<starsToPrint-2; l++) {
                System.out.print("*");
            }
            System.out.println();
            spacesToPrint+=1;
            starsToPrint-=2;
        }
    }
}
