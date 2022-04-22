package com.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class S3_1448 {

    // 보류
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] input = new int[n];

        for(int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }

        Arrays.sort(input);

        int result = 0;

        for(int i=0; i < n; i++) {
            int sum = input[i] + input[i+1] ;
        }

        System.out.println(result);
    }
    
}