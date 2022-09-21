package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_2579 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        // 최대 값 계산 저장 배열
        int[] score = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        score[0] = arr[0];
        
        if(n > 1) {
            score[1] = arr[0] + arr[1];
        }

        if(n > 2) {
            score[2] = Math.max(arr[0], arr[1]) + arr[2];
            
            for(int i=3; i<n; i++) {
                score[i] = Math.max(score[i-2], score[i-3] + arr[i-1]) + arr[i];
            }
        }

        System.out.println(score[n-1]);

    }
}
