package com.baekjoon.silver5;

import java.util.Scanner;

public class S5_1789 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        long s = scan.nextLong();
        int n = 0;
        long temp_s = 0 ;

        for ( int i = 1; ; i++ ) {
            if ( temp_s > s ) {
                break;
            }
            
            temp_s += i ;
            n++;

        }

        System.out.println(n-1);
        scan.close();

    }
    
}
