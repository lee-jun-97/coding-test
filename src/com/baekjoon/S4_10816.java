package com.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_10816 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++) {
            Integer num = Integer.parseInt(st.nextToken());
            Integer cnt = map.get(num);
            if(cnt != null) {
                map.put(num, cnt+1);
            } else {
                map.put(num, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<m; i++) {
            Integer num = Integer.parseInt(st.nextToken());
            Integer cnt = map.get(num);
            if(cnt != null) {
                sb.append(cnt+ " ");
            } else {
                sb.append("0 ");
            }
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.print(sb.toString());
    }
}
