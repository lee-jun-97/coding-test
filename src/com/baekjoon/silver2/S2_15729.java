package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S2_15729 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<Integer, Boolean> input = new HashMap<>();
        Map<Integer, Boolean> list = new HashMap<>();

        int count = 0;

        for(int i=0; i<n; i++) {
            input.put(i, st.nextToken().equals("1")?true:false);
            list.put(i, false);
        }

        for(int i=0; i<n; i++) {
            if(input.get(i) != list.get(i)) {
                for(int j=0; j<3; j++) {
                    if(i+j == list.size()) {
                        break;
                    }
                    list.put(i+j, !list.get(i+j));
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
