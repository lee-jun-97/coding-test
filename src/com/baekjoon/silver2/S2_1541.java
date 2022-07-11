package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S2_1541 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("-");

        int sum  = Integer.MAX_VALUE;

        for(int i=0; i<input.length; i++) {
            int num = 0;
            String[] temp = input[i].split("\\+");
            for(String str : temp) {
                num += Integer.parseInt(str);
            }

            if( sum == Integer.MAX_VALUE ) {
                sum = num;
            } else {
                sum -= num ;
            }
        }

        System.out.println(sum);
        
    }

}
