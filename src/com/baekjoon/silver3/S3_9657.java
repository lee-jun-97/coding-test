package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_9657 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        if( n % 7 == 2 || n % 7 == 0 ) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
    
}
