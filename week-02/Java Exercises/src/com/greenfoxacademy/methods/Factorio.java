package com.greenfoxacademy.methods;

import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        // - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int userInput = reader.nextInt();
        System.out.println("Factorial: " + factorio(userInput));
    }

    static Integer factorio(int number){
        int factorial = 1;
        for (int i = number; i>1; i--) {
            factorial*=i;
        }
        return factorial;
    }
}
