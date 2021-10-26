package String;

public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        StringBuilder sb = new StringBuilder(todoText);
        sb.insert(0, "My todo:\n");
        sb.insert( sb.length()-1, "\n - Download games\n");
        sb.insert(sb.length()-1, "\t- Diablo" );

        todoText = sb.toString();

        System.out.println(todoText);
    }
}
