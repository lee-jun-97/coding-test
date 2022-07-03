package com.baekjoon.silver3;

import java.util.Arrays;
import java.util.Scanner;

public class S3_2012 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(arr);

        long sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i] - (i+1));
        }

        System.out.println(sum);
    }
    
}
