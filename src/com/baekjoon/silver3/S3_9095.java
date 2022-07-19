package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_9095 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[11];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=4; i<11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3] ;
        }

        for(int i=0; i<n; i++) {
            
            int num = Integer.parseInt(br.readLine());
            sb.append(arr[num]).append("\n");

        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
