package com.greenfoxacademy.loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
// Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5
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
