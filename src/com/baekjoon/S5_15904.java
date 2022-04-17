package com.baekjoon;

import java.util.Scanner;

public class S5_15904 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        String input = scan.nextLine();

        String[] chArr = {"U", "C", "P", "C"};
        String[] strArr = input.split("");
        String result = "";
        int i = 0;

        for ( String j : strArr ) {
            if ( j.equals(chArr[i]) ) {
                i++;
            }

            if ( i == 4 ) {
                result = "I love UCPC";
                break;
            }

            result = "I hate UCPC";
        }
        scan.close();

        System.out.println(result);
    }
}