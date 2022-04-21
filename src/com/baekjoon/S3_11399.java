package com.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class S3_11399 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(arr);

        int result = 0;
        int temp = 0;

        for (int i=0; i<n; i++) {
            result += arr[i] + temp;
            temp += arr[i];
        }

        System.out.println(result);

    }
    
}
