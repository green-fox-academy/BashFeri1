package com.greenfoxacademy.methods;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        // - Készíts egy függvényt ami bemeneti paraméterként egy integer array-t vár.
        // - A függvény térjen vissza egy olyan listával ahol az összes szám csak egyszer fordul elő.

        //  Példa
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));
        //  Eredmény kiíratva: `[1, 11, 34, 52, 61]`

    }

    static  int[] unique (int[] array){
        Arrays.sort(array);
        int[] uniqueArray = new int[uniqueArrayLength(array)];
        int arrayIndex=0;
        for (int i = 0; i< uniqueArray.length; i++) {
           if (i== uniqueArray.length-1) {
                uniqueArray[i]=array[arrayIndex];
                break;
           } else if(array[arrayIndex]==array[arrayIndex+1]){
                i--;
                if (array.length < arrayIndex-2){
                    arrayIndex++;
                }

           } else {
                uniqueArray[i]=array[arrayIndex];
           }
           arrayIndex++;
        }
        return uniqueArray;
    }

    static int uniqueArrayLength(int[] array) {
        int numberOfDuplicates = 0;
        for (int i = 0; i< array.length-1; i++) {
            if(array[i]==array[i+1]){
                numberOfDuplicates++;
            }
        }
        return array.length-numberOfDuplicates;
    }
}
