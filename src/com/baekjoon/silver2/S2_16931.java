package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_16931 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        int result = 0;
        int count = 0;

        for(int i=0; i<n; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int max = 0;
            for(int j=0; j<m; j++) {

                int temp = Integer.parseInt(st.nextToken());
                map[i][j] = temp;

                if(max == map[i][j]) {
                    count++;
                }

                max = Math.max(max, temp);
            }

            result += (max * 2);
        }

        for(int i=0; i<n; i++) {

            int max = 0;

            for(int j=0; j<m; j++) {
                if(max == map[j][i]) {
                    count++;
                }
                max = Math.max(map[j][i], max);
            }

            result += (max * 2);
        }

        result += (n * m * 2);

        System.out.println(result + count);
    }
}
