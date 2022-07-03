package com.baekjoon.silver5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// TO-DO : bit 연산자 이용하여 수정해아 함.
public class S5_11723 {

    static Set<String> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextLine().split(" ");
        }

        scan.close();

        for(int i=0; i<n; i++) {
            switch(arr[i][0]) {
                case "add" :  set.add(arr[i][1]); break;
                case "check" : check(arr[i][1]); break;
                case "remove" : set.remove(arr[i][1]); break;
                case "toggle" : toggle(arr[i][1]); break;
                case "all" : all(); break;
                case "empty" : set.clear(); break;
            }
        }


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
