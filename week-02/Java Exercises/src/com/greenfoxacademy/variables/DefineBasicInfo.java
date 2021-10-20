package com.greenfoxacademy.variables;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)
        String name = "Ferenc";
        int age = 31;
        double height = 1.86;
        boolean married = false;

        System.out.println(name+", "+age+", "+height+"\nMarried: "+married );
    }
}
