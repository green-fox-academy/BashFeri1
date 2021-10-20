package com.greenfoxacademy.arrays;

import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` tömb összes elemének összegét
        int[] numbers = new int[] {3, 4, 5, 6, 7};
        int numbersSum = 0;

        for (int i = 0; i< numbers.length; i++) {
            numbersSum+=numbers[i];
        }

        System.out.println(numbersSum);
    }
}
