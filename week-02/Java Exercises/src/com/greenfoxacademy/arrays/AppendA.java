package com.greenfoxacademy.arrays;

import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        // - Készíts egy `animals` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["koal", "pand", "zebr"]`
// - Minden elemhez csatolj egy "a" betűt a szó végére

        String[] animals = new String[] {"koal", "pand", "zebr"};

        for(int i=0; i< animals.length; i++) {
            animals[i]+="a";
        }

        //test output
        System.out.println(Arrays.toString(animals));
    }
}
