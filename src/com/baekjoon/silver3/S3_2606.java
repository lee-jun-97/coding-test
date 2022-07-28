package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class S3_2606 {

    static int[][] arr;
    static boolean[] visit;
    static Queue<Integer> queue = new LinkedList<>();
    static Stack<Integer> stack = new Stack<>();
    static int count = 0;
    static int nodeCnt;
    static int lineCnt;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nodeCnt = Integer.parseInt(br.readLine());
        lineCnt = Integer.parseInt(br.readLine());

        arr = new int[nodeCnt+1][nodeCnt+1];
        visit = new boolean[nodeCnt+1];

        StringTokenizer st;

        for(int i=0; i<lineCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        dfs(1);

        System.out.println(count-1);

    }

    public static void bfs(int start) {

        count = 0;
        
        queue.add(start);
        visit[start] = true;
        
        while(!queue.isEmpty()) {

            int temp = queue.poll();
            
            for(int i=1; i<arr.length; i++) {
                if(arr[temp][i] == 1 & visit[i] == false) {
                    queue.add(i);
                    visit[i] = true;
                }
            }

            count++;
        }
    }

    public static void dfs(int start) {

        count = 0;

        stack.push(start);
        visit[start] = true;

        while(!stack.isEmpty()) {

            int temp = stack.pop();
            
            for(int i=1; i<arr.length; i++) {
                if(arr[temp][i] == 1 && visit[i] == false) {
                    stack.push(i);
                    visit[i] = true;
                }
            }

            count++;
        }

    }
}