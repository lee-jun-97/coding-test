package com.baekjoon.silver3;

import java.util.Arrays;
import java.util.Scanner;

public class S3_1449 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int l = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(arr);

        int cnt = 0;

        while(true) {
            int i = 0;

            if ( arr.length - i < l) {
                cnt++;
                break;
            }

            if ( l-1 == arr[i+l-1] - arr[i] ) {
                cnt++;
                i+=l;
            }

            if ( i > arr.length ) {
                break;
            }
        }

        System.out.println(cnt);

    }
    
}
