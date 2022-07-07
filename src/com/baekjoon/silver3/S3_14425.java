package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S3_14425 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] num = br.readLine().split(" ");

        Set<String> set = new HashSet<>();

        for(int i=0; i<Integer.parseInt(num[0]); i++) {
            set.add(br.readLine());
        }

        int result = 0;
        for(int i=0; i<Integer.parseInt(num[1]); i++) {
            if(set.contains(br.readLine())) {
                result++;
            }
        }

        System.out.println(result);
    }

}
