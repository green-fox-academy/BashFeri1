public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // Az idézet mentésekor lemezhiba történt. Kérlek, javítsd ki.
        // Add hozzá az "always takes longer than"-t a StringBuilder (quote) -hoz
        // az "It" és a "you" szó közzé.
        // Használd a quote változó darabjait(a String újra definiálása helyett).

        StringBuilder sb = new StringBuilder(quote);

        sb = sb.insert(21, "always takes longer than ");

        quote = sb.toString();

        System.out.println(quote);
    }
}
