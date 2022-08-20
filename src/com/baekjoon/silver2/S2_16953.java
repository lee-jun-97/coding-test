package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_16953 {

    static Queue<long[]> queue = new LinkedList<>(); 
    static long result = 0;
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        bfs(a, b, 0);

        if(queue.isEmpty()) {
            System.out.println(-1);   
        } else {
            System.out.println(result + 1);
        }

    }

    public static void bfs(long a, long b, long count) {

        queue.add(new long[] {a, count});

        while(!queue.isEmpty()) {

            long[] temp = queue.peek();

            if(temp[0] == b) {
                result = temp[1];
                break;
            } else if(temp[0] > b ) {
                queue.poll();
            } else {
                queue.poll();
                String str = String.valueOf(temp[0]) + "1";
                queue.add(new long[] {temp[0]*2, temp[1]+1});
                queue.add(new long[] {Long.parseLong(str), temp[1] + 1});
            }
        }

    }
}
