package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_2644 {
    
    static int[][] graph;
    static boolean[] visit;
    
    static int n;
    static int result = -1;

    static int a;
    static int b;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visit = new boolean[n+1];

        st = new StringTokenizer(br.readLine()," ");

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; i++) {

            st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(a, 0);
        
        System.out.println(result);
    }

    public static void dfs(int start, int count) {

        if(start == b) {
            result = count;
        }

        visit[start] = true;

        for(int i=1; i<=n; i++) {
            if(graph[start][i] == 1 && visit[i] == false) {
                dfs(i, count+1);
            }
        }
    }

}
