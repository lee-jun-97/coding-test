package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class S3_19941 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[] input = br.readLine().toCharArray();

        int result = 0;

        for(int i=0; i<n; i++) {
            if(input[i] == 'P') {

                int start = i-k<0?0:i-k;
                int end = i+k>n-1?n-1:i+k;

                for(int j=start; j<=end; j++) {
                    if(input[j] == 'H') {
                        input[j] = '-';
                        result++;
                        break;
                    }
                }
            }
        }

        System.out.println(result);

    }
    
}
