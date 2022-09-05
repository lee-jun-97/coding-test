package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class S3_13414 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<l; i++) {
            String temp = br.readLine();

            if(set.contains(temp)) {
                set.remove(temp);
            }
            set.add(temp);

        }

        int count = 0;

        for(String str : set) {
            sb.append(str).append("\n");
            count++;

            if(count == n) {
                break;
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
