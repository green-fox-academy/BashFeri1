package DataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction2 {
    public static void main(String[] args) {


        /*Készíts egy listát ('listA') mely tartalmazza a következő értékeket:

        Apple, Avocado, Blueberries, Durian, Lychee

        Készíts egy új listát listB névvel amely a listA értékeit tartalmazza.

                Írattasd ki hogy a listA tartalmazza-e a Durian-t vagy sem.

        Távolítsd el a Durian-t a listB-ből.

                Add hozzá a Kivifruit-ot a listA 4. eleme utánn.

        Hasonlítsd össze listA és listB méretét.

        Keresd meg az Avocado indexét a listA-ban.

                Keresd meg az Durian indexét a listB-ban.

                Add hozzá a listB-hez a Passion Fruit-ot és a Pomelo-t egyszerre.

                Írasd ki a listA 3. elemét.*/
        ArrayList<String> listA = new ArrayList<String>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = (ArrayList<String>)listA.clone();

        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");

        listA.add(4,"Kivifruit");

        System.out.println("A: " + listA.size() + ", B: " + listB.size());

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        Collections.addAll(listB, "Passion Fruit", "Pomelo");

        System.out.println(listA.get(2));

        printListElements(listA);
        printListElements(listB);

    }

    static void printListElements(ArrayList<String> list) {
        System.out.println("----------------------------------\nContents:\n\n");
        for (String word:list) {
            System.out.println(word);
        }
        System.out.println("----------------------------------");
    }
}
