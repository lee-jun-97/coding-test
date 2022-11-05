package com.baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_4796 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test_case = 1;

        while(true) {

            String input = br.readLine();

            if(input.equals("0 0 0")) {
                System.out.println(sb.toString());
                break;
            }

            StringTokenizer st = new StringTokenizer(input, " ");

            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int temp = v / p;
            int result = temp * l;

            temp = v % p;

            if(temp < l) {
                result += temp;
            } else {
                result += l;
            }

            sb.append("Case ").append(test_case).append(": ").append(result).append("\n");

            test_case++;
        }

    }
}
