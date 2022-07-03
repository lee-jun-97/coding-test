package com.baekjoon.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class S5_10815 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scan.nextInt();
        int[] arr1 = new int[n];

        for(int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr2 = new int[m];

        for(int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(arr1);
        
        for(int i = 0; i < m; i++) {
            if(binarySearch(arr1, arr2[i])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    // 중첩 for문으로 수행하였을 시 시간 초과 발생함
    // 이분 탐색으로 시간 줄임.
    static boolean binarySearch(int[] arr1, int num) {

        int left = 0;
        int right = arr1.length - 1;
        
        while(left<=right) {
            int mid = (left + right) / 2;

            if(num > arr1[mid]) {
                left = mid + 1;
            } else if(num < arr1[mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}