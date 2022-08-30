package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class S2_14426 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;

        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            String input = br.readLine();

            for(int j=1; j<=input.length(); j++) {
                set.add(input.substring(0, j));
            }
        }

        for(int i=0; i<m; i++) {
            if(set.contains(br.readLine())) {
                result++;
            }
        }

        System.out.println(result);
    }
}
