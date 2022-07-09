package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S3_11478 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Set<String> set = new HashSet<>();

        int lastIndex = 0;
        while(lastIndex < input.length()) {
            int firstIndex = 0;

            for(int i=lastIndex; i<=input.length(); i++) {
                String temp = input.substring(firstIndex, i);
                if(!set.contains(temp)) {
                    set.add(temp);
                }
                firstIndex++;
            }
            lastIndex++;
        }

        System.out.println(set.size());
    }

}
