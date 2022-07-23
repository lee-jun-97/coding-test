package com.baekjoon.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class G4_1715 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                return e1 - e2;
            }
        });

        for(int i=0; i<n; i++) {
            pQueue.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;

        while(pQueue.size() != 1) {
            int n1 = pQueue.poll();
            int n2 = pQueue.poll();

            int sum = n1 + n2;
            result += sum;

            pQueue.add(sum);
        }

        System.out.println(result);
    }

}