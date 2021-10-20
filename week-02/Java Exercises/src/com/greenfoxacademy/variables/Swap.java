package com.greenfoxacademy.variables;

public class Swap {
    public static void main(String[] args) {
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.
        int a = 123;
        int b = 526;
        int c = b-a;

        b=a;
        a=c+a;

        System.out.println(a);
        System.out.println(b);

    }
}
