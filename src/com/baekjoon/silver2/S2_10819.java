package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_10819 {

    static int sum = 0;
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        permutation(arr, 0, n ,n);

        System.out.println(sum);
        
    }

    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {

            int temp = 0;

            for(int i=0; i<n-1; i++) {
                temp += Math.abs(arr[i]- arr[i+1]);
            }

            sum = Math.max(sum, temp);
            return;
        }
     
        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }
     
    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
}
