package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_1463 {
    
    static Integer[] arr;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new Integer[n+1];
        arr[0] = arr[1] = 0;
        
        System.out.println(solve(n));
    }

    public static int solve(int n) {

        if(arr[n] == null) {

            if(n%6 == 0) {
                arr[n] = Math.min(solve(n-1), Math.min(solve(n/3), solve(n/2))) + 1;
            } else if(n%3 == 0) {
                arr[n] = Math.min(solve(n/3), solve(n-1)) + 1;
            } else if(n%2 == 0) {
                arr[n] = Math.min(solve(n/2), solve(n-1)) + 1;
            } else {
                arr[n] = solve(n-1) + 1;
            }

        }

        return arr[n];
    }
}
