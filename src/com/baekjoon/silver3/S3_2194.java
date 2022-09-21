package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_2194 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n+1];

        arr[1] = 1;
        // 경계값 조건 필수
        if(n > 1) {
            arr[2] = 1;
            for(int i=3; i<=n; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        
        System.out.println(arr[n]);
    }
}
