package com.greenfoxacademy;

public class FindTheSubstring {
    public static void main(String[] args) {
        System.out.println(subStr("this is what I'm searching in", "searching"));
        System.out.println(subStr("this is what I'm searching in", "not"));
    }

    public static int subStr(String input, String q) {
        if(input.contains(q)){
            return input.indexOf(q);
        }
        return -1;
    }
}
