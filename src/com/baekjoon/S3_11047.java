package com.baekjoon;

import java.util.Scanner;

public class S3_11047 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        Integer[] coin = new Integer[n];

        for(int i = n-1; i >= 0; i--) {
            coin[i] = scan.nextInt();
        }

        scan.close();

        int cnt = 0;

        for (int i : coin) {
            if ( (k / i) != 0  ) {
                cnt += (k / i) ;
                k = k % i ;
            }
        }

        System.out.println(cnt);
    }
    
}
