package com.greenfoxacademy.loops;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type number of rows for square size: ");
        int sideSize = reader.nextInt();

        for(int i = 0; i<sideSize; i++) {
            System.out.print("% ");
            for (int j = 0; j<sideSize-2; j++) {
                if (i==0 || i==sideSize-1) {
                    System.out.print("% ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("%");
        }
    }
}
