package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        /*A kiadásainkat egy Integereket tartalmazó listával fogjuk reprezentálni.

        Készíts egy listát az alábbi elemekkel:
        500, 1000, 1250, 175, 800 és 120

        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
        Mennyit költöttünk?
        Melyik volt a legnagyobb kiadásunk?
                Melyik volt a legkisseb kiadásunk?
        Mennyi volt az átlag kiadásunk?*/

        ArrayList<Integer> expenses = new ArrayList<>();
        Collections.addAll(expenses, 500, 1000, 1250, 175, 800, 120);

        System.out.println("Total spent: " + totalSpent(expenses));
        System.out.println("Average expense: " + averageExpense(expenses));
        System.out.println("Smallest expense: " + smallestExpense(expenses));
        System.out.println("Biggest expense: " + biggestExpense(expenses));
    }

    static Integer totalSpent(ArrayList<Integer> expenses) {
        int spentSum= 0;
        for(int record:expenses){
            spentSum+=record;
        }
        return spentSum;
    }

    static Integer averageExpense(ArrayList<Integer> expenses){
        return totalSpent(expenses)/expenses.size();
    }

    static Integer smallestExpense(ArrayList<Integer> expenses) {
        Collections.sort(expenses);
        return expenses.get(0);
    }

    static Integer biggestExpense(ArrayList<Integer> expenses) {
        Collections.sort(expenses);
        return expenses.get(expenses.size()-1);
    }
}
