package com.greenfoxacademy.variables;

public class SecondsInADay {
    public static void main(String[] args) {
        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsFromHoursRemaining = (23-currentHours)*3600;
        int secondsFromMinutesRemaining = (59-currentMinutes)*60;
        int secondsRemaining = 60-currentSeconds;

        int totalSecondsRemaining = secondsFromHoursRemaining+secondsFromMinutesRemaining+secondsRemaining;

        System.out.println("seconds remaining until tomorrow: " + totalSecondsRemaining);
    }
}
