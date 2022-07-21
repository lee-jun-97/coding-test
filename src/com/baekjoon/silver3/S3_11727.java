package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_11727 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<=n; i++) {
            arr[i] = (arr[i-1] + (arr[i-2] * 2)) % 10007 ;
        }

        System.out.println(arr[n]);
    }

}
