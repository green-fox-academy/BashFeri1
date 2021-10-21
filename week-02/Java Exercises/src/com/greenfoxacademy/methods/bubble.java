package com.greenfoxacademy.methods;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        // - Készíts egy függvényt `buddle` névvel ami bemeneti paraméterként egy integer listát vár.
        // - A fügvény egy listát adjon vissza ahol a lista elemei növekvő sorrendbe vannak rendezve.

        // - Készíts egy második függvényt `advancedBubble` névvel ami két paramétert vár, egy integer listát
        //   és egy booleant.
        // - A fügvény egy listát adjon vissza, ahol a lista elemei növekvő sorrendbe vannak rendezve,
        //   ha a boolean false. Ha pedig true, akkor a listát csökkenő sorrendbe rendezve adja vissza.

        //  Példa:
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        //  Eredmény kiíratva: [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[] {34, 12, 24, 9, 5})));
        //  Eredmény kiíratva: [34, 24, 12, 9, 5]
    }

    static int[] bubble(int[] list){
        for(int i = list.length-1; i>=0; i--) {
            int valueStorage=list[i];
            list[i]=list[biggestNumberIndex(list, i)];
            list[biggestNumberIndex(list, i)] = valueStorage;
        }
        return list;
    }

    static int[] advancedBubble(int[] list) {
        list = bubble(list);
        int reverseIndex = 0;
        for(int i=0; i< list.length; i++){
            reverseIndex=list.length-1-i;
            if (i==list.length-i-1) {
                break;
            }
            int valueStorage = list[i];
            list[i]=list[reverseIndex];
            list[reverseIndex]=valueStorage;
            if(reverseIndex-i==2){
                break;
            }
        }
        return list;
    }

    static Integer biggestNumberIndex(int[] list, int searchUntilIndex) {
        int indexOfbiggestNumber=0;
        for (int i=1; i<=searchUntilIndex; i++) {
            if(list[indexOfbiggestNumber]<list[i]) {
                indexOfbiggestNumber=i;
            }
        }
        return indexOfbiggestNumber;
    }
}
