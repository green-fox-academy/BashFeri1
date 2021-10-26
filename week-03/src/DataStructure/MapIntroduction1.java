package DataStructure;

import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        /*Asszociatív tömbökkel(Map) fogunk játszani. Nyugodtan használj bármilyen beépített függvényt, ahol lehetséges.

                Készíts egy üres asszociatív tömböt (Map) ahol a kulcsok(keys) integerek és az értékek(values) karakterek.

                Írasd ki hogy a map üres e vagy sem.

        Add hozzá az alábbi kulcs(key) érték(value) párokat a map-hez.
                Kulcs (Key) 	Érték (Value)
        97 	a
        98 	b
        99 	c
        65 	A
        66 	B
        67 	C

        Írasd ki az összes kulcsot.

                Írasd ki az összes értéket.

        Add hozzá a D értéket az 68-as kulccsal.

                Írasd ki hány kulcs érték pár van a map-ben.

                Írasd ki a 99-es kulcshoz tartozó értéket.

                Töröld ki azt a kulcs-érték párt, ahol a kulcs 97.

        Írasd ki van-e társítva érték a 100-as kulcshoz vagy sem.

                Távolítsd el az összes kulcs érték párt.*/
        HashMap<Integer, Character> characters = new HashMap<>();
        System.out.println(characters.isEmpty());

        characters.put(97,'a');
        characters.put(98,'b');
        characters.put(99,'c');
        characters.put(65,'A');
        characters.put(66,'B');
        characters.put(67,'C');

        for(int key : characters.keySet()){
            System.out.println(key);
        }

        for(char letter: characters.values()) {
            System.out.println(letter);
        }

        characters.put(68, 'D');
        System.out.println(characters.size());
        System.out.println(characters.get(99));

        characters.remove(97);

        System.out.println(characters.containsKey(100));

        characters.clear();

    }
}
