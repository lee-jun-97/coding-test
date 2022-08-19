package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_1769 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        int sum = 0;
        String result = "";

        while(true) {
            
            if(input.length() == 1) {
                // while문 밖에서 하는 건 안 되고 안에서 하는 건 왜 되지
                result = Integer.parseInt(input)%3 == 0?"YES":"NO";
                break;
            }

            sum = 0;

            for(int i=0; i<input.length(); i++) {
                sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            }

            input = String.valueOf(sum);

            count++;
            
        }

        System.out.println(count);
        System.out.println(result);
    }
}
