package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_13549 {

    public static class Node {
        int a;
        int b;

        public Node(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static Queue<Node> queue = new LinkedList<>();
    static boolean[] visited = new boolean[100001];

    static int n;
    static int k;
    static int max = 100000;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n  = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        queue.add(new Node(n, 0));
        visited[n] = true;

        bfs();

    }

    static void bfs() {

        int min = Integer.MAX_VALUE;

        while(!queue.isEmpty()) {

            Node temp = queue.poll();

            int loc = temp.a;
            int count = temp.b;

            visited[loc] = true;

            if(loc == k) {
                min = Math.min(min, count);
            }

            if(loc*2 <= max && !visited[loc * 2]) {
                queue.offer(new Node(loc * 2, count));
            }

            if(loc + 1 <= max && !visited[loc + 1]) {
                queue.offer(new Node(loc + 1, count + 1));
            }

            if(loc - 1 >= 0 && !visited[loc - 1]) {
                queue.offer(new Node(loc - 1, count + 1));
            }
        }

        System.out.println(min);
    }
}