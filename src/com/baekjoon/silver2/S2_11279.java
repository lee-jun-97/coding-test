package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class S2_11279 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pQueue = new PriorityQueue<>((e1, e2) -> e2 - e1);

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0) {
                if(pQueue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pQueue.poll()).append("\n");
                }
            } else {
                pQueue.add(input);
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());

    }
}
