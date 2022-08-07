package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_11725_arr {
    
    static int[][] graph;
    static boolean[] visit;
    static int[] parent;

    static int n;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visit = new boolean[n+1];
        parent = new int[n+1];

        for(int i=1; i<n; i++) {
            st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[y][x] = 1;
            graph[x][y] = 1;

        }

        dfs(1);

        for(int i=2; i<=n; i++) {
            sb.append(parent[i]).append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

    public static void dfs(int start) {

        visit[start] = true;

        for(int i=2; i<=n; i++) {
            if(graph[start][i] == 1 && visit[i] == false) {
                parent[i] = start;
                dfs(i);
            }
        }
    }
}
