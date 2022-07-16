package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S4_2839 {
    
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 설탕 키로수에 따른 봉지 개수 정리하면 규칙성 보임.
        if(n == 4 || n == 7) {
            System.out.println(-1);
        } else if(n%5 == 0) {
            System.out.println( n/5 );
        } else if(n%5 == 1 || n%5 == 3) {
            System.out.println( (n/5) + 1 );
        } else if(n%5 == 2 || n%5 == 4) {
            System.out.println( (n/5) + 2);
        }

    }

}
