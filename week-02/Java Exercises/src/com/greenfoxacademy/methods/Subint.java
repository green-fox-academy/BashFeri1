package com.greenfoxacademy.methods;

import java.util.Arrays;

public class Subint {
    public static void main(String[] args) {
        // - Készíts egy függvényt ami bemeneti paraméterként egy számot és egy integer array-t vár.

        // - Visszaadja a bemeneti tömb azon indexeit, ahol a tömb értékei tartalmazzák az első bemeneti értéket.
        // - Vagy egy üres array-t ad vissza, amennyiben az első bemeneti értéket a lista sehol sem tartalmazza.

        //  Példa:
        System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
        //  Eredmény kiíratva: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
        //  Eredmény kiíratva: '[]'

        // Megjegyzés: Az array kiirattatására használhatjuk az Arrays.toString() függvényt.
        // Vagy használhatjuk a végigiterálást is.
    }

    static int[] subInt(int numberToFind, int[] arrayToSearch) {
        //find number of matches so array length could be determined
        int numberOfMatches = 0;
        for (int i = 0; i< arrayToSearch.length; i++) {
            if (containsNumber(numberToFind, arrayToSearch[i])) {
                numberOfMatches++;
            }
        }
        if(numberOfMatches==0) {
            return new int[]{};
        }
        int[] indexOfMatches = new int[numberOfMatches];
        //determine index of values
        int indexCounter = -1;
        for (int i = 0; i< arrayToSearch.length; i++) {
            if (containsNumber(numberToFind, arrayToSearch[i])) {
                indexCounter++;
                indexOfMatches[indexCounter]=i;
            }

        }
        return indexOfMatches;
    }

    static boolean containsNumber(int numberToLook, int numberToSearch) {
        String numToLook = "" + numberToLook;
        String numToSearch = "" + numberToSearch;
        return numToSearch.contains(numToLook);
    }
}
