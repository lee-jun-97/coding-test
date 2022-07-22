package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S5_1427 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        char[] arr = input.toCharArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());

    }

}
