package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_11055 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] input = new int[n];
        int[] sum = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        sum = input.clone();

        int result = sum[0];

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                if(input[i] > input[j]) {
                    sum[i] = Math.max(sum[i], input[i] + sum[j]);
                    result = Math.max(result, sum[i]);
                }
            }
        }

        System.out.println(result);
    }
}
