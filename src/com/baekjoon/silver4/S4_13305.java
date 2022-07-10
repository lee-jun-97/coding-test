package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_13305 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] len = new long[n-1];
        long[] city = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n-1; i++) {
            len[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            city[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = city[0];

        for(int i=0; i<n-1; i++) {
            if(min > city[i]) {
                min = city[i];
            }

            sum += (min*len[i]);
        }

        System.out.println(sum);
        
    }

}
