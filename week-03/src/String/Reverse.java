package String;

public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Készíts egy függvényt ami megfordít egy Stringet, amit
        // bemeneti paraméterként kap.
        // Használd a függvényt a "toBeReversed" változón ellenőrzésként.
        // Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
        // opcionálisan akárhogy.

        System.out.println(reverse(toBeReversed));
    }

    static String reverse (String word) {
        char[] characterList = word.toCharArray();
        for (int index = 0; index < word.length()/2; index++) {
            int reverseIndex = word.length()-index-1;
            char helper= word.charAt(reverseIndex);

            if(reverseIndex-index>=2) {
                characterList[reverseIndex] = word.charAt(index);
                characterList[index] = helper;
            } else {
                break;
            }
        }
        word = arrayStringBuilder(characterList);

        return word;
    }

    static String arrayStringBuilder (char[] Array) {
        String word = "";
        for (char letter:Array) {
            word+=letter;
        }
        return word;
    }
}
