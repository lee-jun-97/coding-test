package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_11724 {

    static StringTokenizer st;
    static int[][] arr;
    static boolean[] visit;
    static int count = 0;
    static int n;
    static int m;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        for(int i=1; i<n+1; i++) {
            if(visit[i] == false) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    public static void dfs(int start) {

        visit[start] = true;

        for(int i=1; i<n+1; i++) {
            if(arr[start][i] == 1 && visit[i] == false) {
                dfs(i);
            }
        }
    }
}
