package com.greenfoxacademy.types;

public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        int hoursPerDay = 6;
        int numberOfWeeks = 17;
        int numberOfWorkdays = numberOfWeeks * 5;
        int hoursInWeek = 7*24;
        int hoursWorkedPerWeek = 52;
        double percentageWorkedPerWeek = ((double)hoursWorkedPerWeek/hoursInWeek)*100;

        System.out.println("Hours spent coding during 17 weeks: " + numberOfWorkdays*hoursPerDay);
        System.out.println("Percentage of time worked per week: " + percentageWorkedPerWeek + " %");
    }
}
