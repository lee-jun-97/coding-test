package com.baekjoon.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G4_1753 {

    static int[][] map;
    static int[] sum;
    static boolean[] visit;

    static int v;

    static Queue<Integer> q = new LinkedList<>();
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int root = Integer.parseInt(br.readLine());

        map = new int[v+1][v+1];
        sum =  new int[v+1];
        visit = new boolean[v+1];
        
        for(int i=0; i<e; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            
            map[x][y] = w;
        }

        bfs(root);

        for(int i=1; i<=v; i++) {
            if(i == root) {
                sb.append(0).append("\n");
            } else if(sum[i] == 0) {
                sb.append("INF").append("\n");
            } else {
                sb.append(sum[i]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static void bfs(int root) {

        q.offer(root);

        
        while(!q.isEmpty()) {
            
            int temp = q.poll();
            visit[temp] = true;
            int sum_temp = sum[temp];

            for(int i=1; i<=v; i++){
                if(map[temp][i] != 0 && !visit[i]) {
                    if(sum[i] == 0) {
                        sum[i] = sum_temp + map[temp][i];
                    } else {
                        sum[i] = Math.min(sum_temp + map[temp][i], Math.min(Integer.MAX_VALUE, sum[i]));
                    }
                    q.offer(i);
                }
            }
        }
    }
}
