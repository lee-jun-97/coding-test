package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S4_1543 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String input = br.readLine();

        int str_len = str.length();

        // 반복해서 replace 할 경우 추가적으로 진행될 경우가 있음.
        str = str.replaceAll(input, "");

        int result = str_len - str.length() ;

        System.out.println(result / input.length());
    }
    
}
