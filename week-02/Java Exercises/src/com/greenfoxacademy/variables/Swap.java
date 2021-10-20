package com.greenfoxacademy.variables;

public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int c = b-a;

        b=a;
        a=c+a;

        System.out.println(a);
        System.out.println(b);

    }
}
