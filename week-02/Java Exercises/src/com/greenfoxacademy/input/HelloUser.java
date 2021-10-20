package com.greenfoxacademy.input;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét
        Scanner reader = new Scanner(System.in);

        System.out.print("Hello!\nPlease type in your name: ");

        String name = reader.nextLine();

        System.out.println("Hello, "+name+"!");
    }


}
