package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_11722 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int[] length = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(length, 1);

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                if(arr[i] < arr[j]) {
                    length[i] = Math.max(length[i], length[j]+1);
                }
            }
        }

        int max = -1;
        for(int i : length) {
            max = Math.max(i, max);
        }

        System.out.println(max);
    }
}
