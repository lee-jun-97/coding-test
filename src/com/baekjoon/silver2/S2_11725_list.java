package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S2_11725_list {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visit;
    static int[] parent;

    static int n;
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        
        visit = new boolean[n+1];
        parent = new int[n+1];

        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());   
        }

        for(int i=0; i<n-1; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
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

        for(int i=1; i<=n; i++) {
            int temp = graph.get(start).get(i); 
            if(visit[temp] == false) {
                parent[temp] = start;
                dfs(i);
            }
        }

    }
}
