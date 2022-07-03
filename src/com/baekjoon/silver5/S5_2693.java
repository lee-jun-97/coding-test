package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S5_2693 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<10; j++) {
                list.add(Integer.parseInt(input[j]));
            }
            Collections.sort(list, Collections.reverseOrder());
            sb.append(list.get(2)).append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
