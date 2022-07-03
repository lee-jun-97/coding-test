package com.baekjoon.silver5;

import java.util.Scanner;

public class S5_2941 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] c = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = scan.next();
        scan.close();

        int result = 0;

        for(String i : c) {
            if(input.contains(i)) {
                input = input.replaceAll(i,"*");
            }
        }

        result = input.length();

        System.out.println(result);

    }
}
