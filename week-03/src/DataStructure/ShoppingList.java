package DataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {
        /*Bevásárló listánkat egy listaként (vagy tömbként) fogjuk reprezentálni, mely stringeket (szöveg) tartalmaz.

                Készíts egy tömböt az alábbi tételekkel:
        tojás, tej, hal, alma, kenyér és csirke
        Készíts egy alkalmazást, mely megválaszolja az alábbi kérdéseket:
        Van tej a listán?
        Van banán a listán?*/

        ArrayList<String> shoppingList = new ArrayList<>();
        Collections.addAll(shoppingList, "Egg", "Fish", "Milk", "Apple", "Bread", "Chickem");

        System.out.println("The list contains milk? " + shoppingList.contains("Milk"));
        System.out.println("The list contains banana? " + shoppingList.contains("Banana"));
    }


}
