package DataStructure;

import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        /*Reprezentáld az alábbi termékeket és árukat:
        Termék 	Ár
        Tej 	1.07
        Rizs 	1.59
        Tojás 	3.14
        Sajt 	12.60
        Csirke 	9.40
        Alma 	2.31
        Paradicsom 	2.58
        Krumpli 	1.75
        Hagyma 	1.10

        Bob bevásárló listája

        Termék 	Mennyiség
        Tej 	3
        Rizs 	2
        Tojás 	2
        Sajt 	1
        Csirke 	4
        Alma 	1
        Paradicsom 	2
        Krumpli 	1

        Alice bevásárló listája

        Termék 	Mennyiség
        Rizs 	1
        Tojás 	5
        Csirke 	2
        Alma 	1
        Paradicsom 	10

        Készíts egy alkalmazást, mely megválaszolja az alábbi kérdéseket:
        Mennyit fizet Bob?
                Mennyit fizet Alice?
        Ki vett több rizst?
        Ki vett több krumplit?
        Ki vett több különböző terméket? (típusok)
                Ki vett több terméket? (darab)*/

        HashMap<String, Double> productPrices = new HashMap<>();
        productPrices.put("Milk",1.07);
        productPrices.put("Rice",1.59);
        productPrices.put("Egg",3.14);
        productPrices.put("Cheese",12.60);
        productPrices.put("Chicken",9.40);
        productPrices.put("Apple",2.31);
        productPrices.put("Tomato",2.58);
        productPrices.put("Potato",1.75);
        productPrices.put("Onion",1.10);

        HashMap<String, Integer> bobList = new HashMap<>();
        bobList.put("Milk",3);
        bobList.put("Rice",2);
        bobList.put("Egg",2);
        bobList.put("Cheese",1);
        bobList.put("Chicken",4);
        bobList.put("Apple",1);
        bobList.put("Tomato",2);
        bobList.put("Potato",1);

        HashMap<String, Integer> aliceList = new HashMap<>();
        aliceList.put("Rice",1);
        aliceList.put("Egg",5);
        aliceList.put("Chicken",2);
        aliceList.put("Apple",1);
        aliceList.put("Tomato",10);

        HashMap<HashMap<String,Integer>, String> shoppingLists = new HashMap<>();
        shoppingLists.put(aliceList,"Alice" );
        shoppingLists.put(bobList, "Bob");

        System.out.println("Shopping cost of Bob: "+shoppingCost(productPrices, bobList));
        System.out.println("Shopping cost of Alice: "+shoppingCost(productPrices, aliceList));
        System.out.println("Who bought more rice? " + whoBoughtMoreProduct("Rice",shoppingLists,bobList,aliceList));
        System.out.println("Who bought more potatoes? " + whoBoughtMoreProduct("Potato",shoppingLists,bobList,aliceList));
        System.out.println("Who bought more apples? " + whoBoughtMoreProduct("Apple",shoppingLists,bobList,aliceList));
        System.out.println("Who has more types of groceries on the list? "+whoHasLongerList(shoppingLists,bobList,aliceList));
        System.out.println("Who has more total items? " + whoBoughtMoreTotal(shoppingLists, bobList, aliceList));
    }

    static double shoppingCost(HashMap<String, Double> store, HashMap<String, Integer> shoppingList ) {
        double cost = 0;
        for (String product:shoppingList.keySet()) {
            double price=store.get(product);
            double quantity=shoppingList.get(product);
            cost += price*quantity;
        }
        return cost;
    }

    static String whoBoughtMoreProduct(String product, HashMap<HashMap<String,Integer>, String> shoppers, HashMap<String, Integer> shopper1, HashMap<String, Integer> shopper2) {
        String name = "";
        int shopper1Amount = 0;
        int shopper2Amount = 0;

        if(shopper1.keySet().contains(product)){
            shopper1Amount = shopper1.get(product);
        }
        if (shopper2.keySet().contains(product)){
            shopper2Amount = shopper2.get(product);
        }

        if (shopper1Amount>shopper2Amount) {
            name = getShopperName(shoppers, shopper1);
        } else if (shopper1Amount<shopper2Amount) {
            name = getShopperName(shoppers, shopper2);
        } else {
            name = "Equal amount for both shoppers";
        }
        return name;
    }

    static String whoHasLongerList(HashMap<HashMap<String,Integer>, String> shoppingLists,HashMap<String, Integer> shopper1, HashMap<String, Integer> shopper2 ) {
        String name = "";

        if(shopper1.size()>shopper2.size()) {
            name = getShopperName(shoppingLists, shopper1);
        } else if(shopper1.size()<shopper2.size()) {
            name = getShopperName(shoppingLists, shopper2);
        } else {
            name = "List length is the same";
        }
        return name;
    }

    static String whoBoughtMoreTotal(HashMap<HashMap<String,Integer>, String> shoppingLists,HashMap<String, Integer> shopper1, HashMap<String, Integer> shopper2 ) {
        String name = "";
        int s1TotalItems=totalNumberOfItems(shopper1);
        int s2TotalItems=totalNumberOfItems(shopper2);

        if(s1TotalItems>s2TotalItems) {
            name = getShopperName(shoppingLists, shopper1);
        } else if(s1TotalItems<s2TotalItems) {
            name = getShopperName(shoppingLists, shopper2);
        } else {
            name = "Item amount is the same";
        }
        return name;
    }



    static String getShopperName(HashMap<HashMap<String,Integer>, String> shoppingLists,HashMap<String, Integer> shoppingList) {
        String name = "";
        for(HashMap<String, Integer> list: shoppingLists.keySet()) {
            if(list.equals(shoppingList)) {
                name = shoppingLists.get(list);
            }
        }
        return name;
    }

    static Integer totalNumberOfItems(HashMap<String, Integer> shoppingList){
        int totalItems = 0;
        for(int amount:shoppingList.values()) {
            totalItems+=amount;
        }
        return totalItems;
    }






}
