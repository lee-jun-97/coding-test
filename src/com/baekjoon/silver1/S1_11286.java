package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S1_11286 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // Queue에 저장하는 순간부터 정렬하기 위해 compare method Override 함.
        // compare return 값이 양수이면 e1 > e2
        // compare return 값이 음수이면 e1 < e2
        // compare return 값이 동일하면 e1 = e2
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer e1, Integer e2) {
                if(Math.abs(e1) == Math.abs(e2)) {
                    return e1 - e2 ;
                } else if(Math.abs(e1) > Math.abs(e2)) {
                    return Math.abs(e1) - Math.abs(e2);
                } else {
                    return -1;
                }
            }
        });

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                queue.add(num);
            } else {
                if(queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
        
    }

}
