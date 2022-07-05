package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S2_18870 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] strarr = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();

        int[] input = new int[n];

        for(int i=0; i<n; i++) {
            input[i] = Integer.parseInt(strarr[i]);
        }

        int[] temp = input.clone();
        Arrays.sort(input);
        int count = 0;

        for(int i=0; i<n; i++) {
            if(!map.containsKey(input[i])) {
                map.put(input[i], count++);
            }
        }

        for(int i=0; i<n; i++) {
            sb.append(map.get(temp[i])).append(" ");
        }


        System.out.println(sb.toString());
    }

}
