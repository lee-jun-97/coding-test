package com.baekjoon.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class S5_11651 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1] ;
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
