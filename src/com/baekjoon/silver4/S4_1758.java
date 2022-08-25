package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S4_1758 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        long sum = 0;

        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<=list.size()-1; i++) {
            long temp = list.get(i) - i;
            if(temp > 0) {
                sum += temp;
            }
        }

        System.out.println(sum);
    }
}
