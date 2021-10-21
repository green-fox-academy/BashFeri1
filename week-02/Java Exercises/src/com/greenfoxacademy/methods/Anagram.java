package com.greenfoxacademy.methods;

public class Anagram {
    public static void main(String[] args) {
        /*Készíts egy isAnagram nevű függvényt, kövesd az eddig használt nyelvi stílus útmutatót. A függvények bemeneten fogadnia a kell két stringet és visszaadni egy logikai (boolean) értéket attól függően, hogy a két string egymás anagrammája vagy sem.
                Példák
        bemenet 1 	bemenet 2 	kimenet
        "dog" 	"god" 	true
        "green" 	"fox" 	false*/
    }

    static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.length()==word2.length()) {
            for (int i = 0; i<word1.length(); i++){
                if(word1.charAt(i)!=word2.charAt(word2.length()-i-1)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
