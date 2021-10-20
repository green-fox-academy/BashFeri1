package com.greenfoxacademy.arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
// - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
// - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit
        int[] numbers = new int[] {4, 5, 6, 7};

        int[] numbersReversed = new int[numbers.length];

        for (int i = numbers.length-1; i>=0; i--) {
            int indexOfReversed = numbers.length-1-i;
            numbersReversed[indexOfReversed]=numbers[i];
        }
        numbers = numbersReversed;

        System.out.println(Arrays.toString(numbers));
    }
}
