package com.baekjoon;

import java.util.Scanner;

public class S5_11650 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        scan.close();

        int[] temp = new int[2] ;

        for(int i=0; i<n-1; i++) {
            if( arr[i][0] > arr[i+1][0] ) {
                temp = arr[i].clone();
                arr[i] = arr[i+1].clone();
                arr[i+1] = temp.clone();
                if( i > 0 && arr[i][0] == arr[i-1][0] ) {
                    if( arr[i][1] < arr[i-1][1] ) {
                        temp = arr[i].clone();
                        arr[i] = arr[i-1].clone();
                        arr[i-1] = temp.clone();
                    }
                }
                if( arr[i][0] == arr[i+1][0] ) {
                    if( arr[i][1] > arr[i+1][1] ) {
                        temp = arr[i].clone();
                        arr[i] = arr[i+1].clone();
                        arr[i+1] = temp.clone();
                    }
                }
            } else if( arr[i][0] == arr[i+1][0] ) {
                if( arr[i][1] > arr[i+1][1] ) {
                    temp = arr[i].clone();
                    arr[i] = arr[i+1].clone();
                    arr[i+1] = temp.clone();
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }

}
