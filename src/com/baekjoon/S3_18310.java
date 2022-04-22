package com.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class S3_18310 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] house = new int[n];

        for(int i = 0; i < n; i++) {
            house[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(house);

        int result = 0;

        if ( n % 2 == 0 ) {
            result = house[n/2 - 1];
        } else {
            result = house [n/2];
        }

        System.out.println(result);
    }
    
}
