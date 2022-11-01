package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S3_14501 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] input = new int[n+10][2];
        int[] sum = new int[n+10];

        Arrays.fill(sum, 0);

        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine()," ");

            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for(int i=1; i<=n+1; i++) {
            int T = input[i][0];
            int P = input[i][1];

            sum[i] = Math.max(sum[i], max);
            
            int nIdx = i + T;

            if(nIdx <= n+1) {
                sum[nIdx] = Math.max(sum[nIdx], sum[i] + P);
            }

            sum[nIdx] = Math.max(sum[nIdx-1], sum[nIdx]);
            max = Math.max(sum[i], max);
        }

        System.out.println(max);

    }
}
