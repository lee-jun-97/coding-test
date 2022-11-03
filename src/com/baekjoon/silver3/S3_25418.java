package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S3_25418 {

    static boolean[] visit;
    static int[] num;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        visit = new boolean[k+1];
        num = new int[k+1];

        bfs(a, k);
    }

    static void bfs(int a, int k) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] { a, 0 });

        visit[a] = true;
        num[a] = 0;

        while(!queue.isEmpty()) {

            int[] node = queue.poll();

            if(node[0] == k) {
                System.out.println(node[1]);
                return ;
            }

            // * 2 한 값을 먼저 해야 목표 값에 더욱 빠르게 접근 가능.
            if(node[0] *2 <= k) {
                visit[node[0] * 2] = true;
                queue.add(new int[] { node[0] * 2, node[1] + 1});
            }

            if(!visit[node[0] + 1]) {
                queue.add(new int[] { node[0] + 1, node[1] + 1});
            }
            
        }
    }
}

