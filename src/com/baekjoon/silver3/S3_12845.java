package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class S3_12845 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                return e2 - e1;
            }
        });

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;

        for(int i=0; i<n; i++) {
            pQueue.add(Integer.parseInt(st.nextToken()));
        }
        
        while(pQueue.size() != 1) {
            int temp_1 = pQueue.poll();
            int temp_2 = pQueue.poll();

            sum += (temp_1 + temp_2);

            pQueue.add(Math.max(temp_1, temp_2));
        }

        System.out.println(sum);
    }
}
