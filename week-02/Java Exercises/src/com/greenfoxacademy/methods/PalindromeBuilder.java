package com.greenfoxacademy.methods;

public class PalindromeBuilder {
    public static void main(String[] args) {
        /*Gyakorlat

        Készíts egy createPalindrome nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót. A függvények bemeneten fogad egy stringet, készít belőle egy palindrómát és visszaadja azt.
        Példák
        bemenet 	kimenet
        "" 	""
        "greenfox" 	"greenfoxxofneerg"
        "123" 	"123321"*/
        System.out.println(createPalindrome("alrighty"));
    }

    static String createPalindrome(String word) {
        String palindrome = word;
        for (int i=word.length()-1; i>=0; i--) {
            palindrome+=word.charAt(i);
        }
        return palindrome;
    }
}
