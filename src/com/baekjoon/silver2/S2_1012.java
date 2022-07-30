package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_1012 {

    static int[][] map;
    static boolean[][] visit;
    static int x;
    static int y;
    static StringTokenizer st;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int count;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            
            st = new StringTokenizer(br.readLine(), " ");

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            map = new int[x][y];
            visit = new boolean[x][y];

            for(int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());

                int temp_x = Integer.parseInt(st.nextToken());
                int temp_y = Integer.parseInt(st.nextToken());

                map[temp_x][temp_y] = 1;

            }
            
            count = 0;
            
            for(int l=0; l<x; l++) {
                for(int j=0; j<y; j++) {
                    if(map[l][j] == 1 && visit[l][j] == false) {
                        count++;
                        dfs(l,j);
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void dfs(int nx, int ny) {

        visit[nx][ny] = true;

            for(int i=0; i<4; i++) {

                int tx = dx[i] + nx;
                int ty = dy[i] + ny;

                if(tx >= 0 && ty >= 0 && tx < x && ty < y) {
                    if(map[tx][ty] == 1 && visit[tx][ty] == false) {
                        dfs(tx, ty);
                    }
                }
            }

    }
    
}
