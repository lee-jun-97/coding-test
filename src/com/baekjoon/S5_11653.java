package com.baekjoon;

import java.util.Scanner;

public class S5_11653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        int i = 2 ;

        while(true) {
            if(n % i == 0) {
                n /= i;
                System.out.println(i);
            } else {
                i++;
            }

            if( n == 1 ) {
                break;
            }
        }
    }
}
