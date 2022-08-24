package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_20365 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int count_B = 0;
        int count_R = 0;

        for(int i=0; i<n; i++) {
            if(input.charAt(i) == 'R') {
                count_R++;
            } else {
                count_B++;
            }
        }

        StringTokenizer st_1 = new StringTokenizer(input, Math.max(count_B, count_R)==count_B?"B":"R");
        StringTokenizer st_2 = new StringTokenizer(input, Math.min(count_B, count_R)==count_B?"B":"R");

        System.out.println(Math.min(st_1.countTokens(), st_2.countTokens())+1);

    }
    
}
