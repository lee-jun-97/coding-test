package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_15904 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String input  = br.readLine();

        StringBuilder sb = new StringBuilder();

        char[] chArr = {'U', 'C', 'P', 'C'};
        String result = "I hate UCPC";
        int j = 0;

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == chArr[j]) {
                j++;
            }

            if(j == 4) {
                result = "I love UCPC";
                break;
            }
        }
        
        sb.append(result);

        System.out.println(sb.toString());
    }
}