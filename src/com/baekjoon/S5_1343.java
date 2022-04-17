package com.baekjoon;

import java.util.Scanner;

public class S5_1343 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String temp = input.replaceAll("XXXX", "AAAA");
        String result = temp.replaceAll("XX", "BB");

        if ( result.contains("X") ) {
            result = "-1" ;
        }
        scan.close();

        System.out.println(result);

    }
    
}
