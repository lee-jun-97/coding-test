package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_20365 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        StringTokenizer st_1 = new StringTokenizer(input, "B");
        StringTokenizer st_2 = new StringTokenizer(input, "R");

        System.out.println(Math.min(st_1.countTokens(), st_2.countTokens())+1);

    }
    
}
