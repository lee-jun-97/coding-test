package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_1904 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.println(1);
            System.exit(0);
        } else if(n == 2) {
            System.out.println(2);
            System.exit(0);
        } else {
            long[] arr = new long[n+1];

            arr[1] = 1;
            arr[2] = 2;
            
            for(int i=3; i<=n; i++) {
                arr[i] = arr[i-1] + arr[i-2];
                arr[i] %= 15746;
            }
            System.out.println(arr[n]);
        }
        
    }
}
