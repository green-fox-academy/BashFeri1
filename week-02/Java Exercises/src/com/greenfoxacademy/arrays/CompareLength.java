package com.greenfoxacademy.arrays;

public class CompareLength {
    public static void main(String[] args) {
        // - Készíts egy `firstArrayOfNumbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[1, 2, 3]`
// - Készíts egy `secondArrayOfNumbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5]`
// - Írasd ki a konzolra, hogy "A secondArrayOfNumbers hosszabb", ha
//   `secondArrayOfNumbers` több elemet tartalmaz, mint az `firstArrayOfNumbers`
        int[] firstArrayOfNumbers = new int[] {1,2,3};
        int[] secondArrayOfNumbers = new int[] {4,5};

        if(secondArrayOfNumbers.length> firstArrayOfNumbers.length) {
            System.out.print("secondArrayOfNumbers is longer");
        }
    }
}
