package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1929 {

    public static boolean[] check;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        check = new boolean[n+1];

        solve();

        for(int i=m; i<=n; i++) {
            if(!check[i]) {
                sb.append(i).append("\n");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void solve() {

        check[0] = check[1] = true;

        for(int i=2; i<Math.sqrt(check.length); i++) {
            if(check[i]) {
                continue;
            }

            for(int j=i*i; j<check.length; j+=i) {
                check[j] = true;
            }

        }
    }
}
