package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S4_1920 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] nArr = br.readLine().split(" ");

        Set<String> set = new HashSet<>();

        for(String str : nArr) {
            set.add(str);
        }

        int m = Integer.parseInt(br.readLine());
        String[] mArr = br.readLine().split(" ");

        for(String i : mArr) {
            if(set.contains(i)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

}
