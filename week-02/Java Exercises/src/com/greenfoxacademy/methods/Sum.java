package com.greenfoxacademy.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.

// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.
        Scanner reader = new Scanner(System.in);
        System.out.print("Type number: ");
        int inputNumber = reader.nextInt();
        System.out.println("Sum is: "+sum(inputNumber));
    }

    static Integer sum (int number) {
        int sum = 0;
        for (int i = 1; i<=number; i++) {
            sum+=i;
        }
        return sum;
    }
}
