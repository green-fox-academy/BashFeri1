package com.greenfoxacademy.arrays;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        // - Készíts egy `orders` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["first", "second", "third"]`
// - Cseréld fel az első és a harmadik elemet az `orders` tömbben
        String[] orders = new String[] {"first", "second", "third"};

        String swapHelper = orders[0];

        orders[0]=orders[2];
        orders[2]=swapHelper;

        //test output
        System.out.println(Arrays.toString(orders));
    }
}
