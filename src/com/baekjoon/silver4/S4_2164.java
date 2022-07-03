package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S4_2164 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.poll();
            // 메모리 초과 범인
            // 위에서 poll 하여도 밑에서 poll 후 add를 다시 해주기 때문에 0이 될 일이 없음.
            // 1이 되면 while 문 조건에서 걸림.
            // if(queue.size() == 1) {
            //     break;
            // }
            queue.add(queue.poll());

        }

        System.out.println(queue.poll());
    }

}
