package com.greenfoxacademy.loops;

public class DrawChessTable {
    public static void main(String[] args) {
        // Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
        for (int i = 0; i<8; i++) {
            for(int j = i; j<i+8; j++) {
                if(j%2==0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
