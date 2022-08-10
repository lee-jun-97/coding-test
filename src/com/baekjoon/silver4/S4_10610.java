package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S4_10610 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int[] arr = new int[num.length()];

        int sum = 0;

        for(int i=0; i<num.length(); i++) {
            int temp = num.charAt(i)-'0';
            arr[i] = temp;
            sum += temp;
        }

        Arrays.sort(arr);

        if(sum % 3 != 0 || arr[0] != 0) {
            System.out.println(-1);
        } else {
            for(int j=arr.length-1; j>=0; j--) {
                System.out.print(arr[j]);
            }
        }

    }
    
}
