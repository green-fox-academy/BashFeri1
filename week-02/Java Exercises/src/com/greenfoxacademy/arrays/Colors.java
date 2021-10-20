package com.greenfoxacademy.arrays;

import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {
        // - Készíts egy kétdimenziós tömböt
//   ami megadott színek különböző árnyalatait tartalmazza
// - A `colors[0]` a zöld árnyalatait tárolja:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - A `colors[1]` a piros árnyalatait:
//   `"orange red", "red", "tomato"`
// - A `colors[2]` pedig a pink árnyalatait:
//   `"orchid", "violet", "pink", "hot pink"`
        String[][] colors = new String[][]
                {{"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},{"orchid", "violet", "pink", "hot pink"}};

        //test colors content
        for (int i = 0; i< colors.length; i++) {
            System.out.println("Content of row "+(i+1)+": "+Arrays.toString(colors[i]));
        }

    }
}
