package DataStructure;

import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
       /* Listákkal fogunk játszani. Nyugodtan használj bármilyen beépített függvényt, ahol lehetséges.

                Készíts egy üres listát, ami Stringeket tartalmaz.
        Írasd ki a lista elemeinek a számát.
                Add hozzá(add) Williemet a listához.
                Írasd ki a lista üres e vagy sem.
                Add hozzá Johnt a listához.
        Add hozzá Amandát a listához.
                Írasd ki a lista elemeinek a számát.
        Írasd ki a lista harmadik elemét.
        Iterálj végig a listán és írasd ki az összes nevet

        William
                John
        Amanda

        Töröld a második elemet a listából
        Iterálj végig a listán fordított sorrendben és írasd ki az összes nevet.

        Amanda
                William

        Távolítsd el a lista összes elemét.*/

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());

        names.add("William");
        System.out.println(names.isEmpty());

        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));

        for(String name:names) {
            System.out.println(name);
        }

        names.remove(1);
        for(int i = names.size()-1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        names.clear();
        System.out.println(names.size());

    }
}
