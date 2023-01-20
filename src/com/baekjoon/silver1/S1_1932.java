package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1932 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int cnt = st.countTokens();
            for(int j=0; j<cnt; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i = n - 1; i>0; i--) {
            for(int j=0; j<i; j++) {
                map[i-1][j] += Math.max(map[i][j], map[i][j+1]);
            }
        }

        System.out.println(map[0][0]);
        
    }
}
