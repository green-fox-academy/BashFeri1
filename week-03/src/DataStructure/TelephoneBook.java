package DataStructure;

import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
      /*  Telefonkönyv

        A névjegyzékünket egy asszociatív tömbként(Map) fogjuk reprezentálni ahol a nevek és a telefonszámok Stringek.

                Készíts egy Map-et az alábbi kulcs-érték párokkal:
        Név (kulcs) 	Telefonszám (érték)
        William A. Lathan 	405-709-1865
        John K. Miller 	402-247-8568
        Hortensia E. Foster 	606-481-6467
        Amanda D. Newland 	319-243-5613
        Brooke P. Askew 	307-687-2982

        Készíts egy alkalmazást, mely megoldja az alábbi problémákat:
        Mi John K. Miller telefonszáma?
        Kinek a száma a 307-687-2982?
                Tudjuk-e Chris E. Myer telefonszámát?*/
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put( "William A. Lathan","405-709-1865" );
        phoneBook.put( "John K. Miller", "402-247-8568");
        phoneBook.put( "Hortensia E. Foster", "606-481-6467");
        phoneBook.put( "Amanda D. Newland", "319-243-5613");
        phoneBook.put( "Brooke P. Askew", "307-687-2982");

        System.out.println("Phone number of John K. Miller: " + phoneBook.get("John K. Miller"));
        System.out.println("Owner of number 307-687-2982: " + whosNumber("307-687-2982",phoneBook) );
        System.out.println("Is there a phone number for Chris E. Myer? " + phoneBook.containsKey("Chris E. Myer"));
    }

    static String whosNumber(String number, HashMap<String, String> phoneBook) {
        for (String name: phoneBook.keySet()) {
            if (number == phoneBook.get(name)) {
                return name;
            }
        }
        return "No such number in Phone Book!";
    }




}
