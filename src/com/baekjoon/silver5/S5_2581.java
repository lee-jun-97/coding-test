package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_2581 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=m; i<=n; i++) {

            // 1은 소수가 아님.
            // 조건문 하나 때문에 계속 틀렸음.
            if(i == 1) {
                continue;
            }

            boolean isOk = true;

            for(int j=2; j<=Math.sqrt((double)i); j++) {
                if(i % j == 0) {
                    isOk = false;
                    break;
                }
            }

            if(isOk) {
                min = Math.min(min, i);
                sum += i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
