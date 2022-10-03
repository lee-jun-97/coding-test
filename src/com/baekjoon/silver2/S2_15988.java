package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S2_15988 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        long[] arr = new long[1000000+1];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=0; i<tc; i++) {
            int n = Integer.parseInt(br.readLine());
            if( n >= 4 ) {
                for(int j=4; j<=n; j++) {
                    long temp = arr[j-1] + arr[j-2] + arr[j-3];
                    arr[j] = temp % 1000000009;
                }
            }
            sb.append(arr[n]).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}