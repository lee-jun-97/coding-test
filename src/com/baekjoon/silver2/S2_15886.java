package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S2_15886 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] arr = new char[n];

        arr = br.readLine().toCharArray();

        int result = 0;

        for(int i=0; i<n-1; i++) {
            if(arr[i] == 'E' && arr[i+1] == 'W') {
                result++;
            }
        }


        System.out.println(result);
    }
}
