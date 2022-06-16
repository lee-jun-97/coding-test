package com.baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S5_11723 {

    static Set<String> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();

        for(int i=0; i<Integer.parseInt(n); i++) {
            String[] temp = scan.nextLine().split(" ");
            switch(temp[0]) {
                case "add" :  set.add(temp[1]); break;
                case "check" : check(temp[1]); break;
                case "remove" : set.remove(temp[1]); break;
                case "toggle" : toggle(temp[1]); break;
                case "all" : all(); break;
                case "empty" : set.clear(); break;
            }
        }

        scan.close();

        sb.toString();

    }

    public static void check(String str) {
        if(set.contains(str)) {
            sb.append("1").append("\n");
        } else {
            sb.append("0").append("\n");
        }
    }

    public static void toggle(String str) {
        if(set.contains(str)) {
            set.remove(str);
        } else {
            set.add(str);
        }
    }

    public static void all() {
        for(int i=1; i<21; i++) {
            set.add(Integer.toString(i));
        }
    }

}
