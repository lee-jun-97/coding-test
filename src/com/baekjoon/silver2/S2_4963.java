package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_4963 {

    static int[][] map;
    static boolean[][] visit;
    static int count;
    static int w;
    static int h;

    // 상하좌우 10, 7, 5, 2
    static int[] dx = {0, 0, -1, 1, -1, -1, 1, 1};
    static int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        while(true) {
            String input = br.readLine();

            if(input.equals("0 0")) {
                break;
            }

            st = new StringTokenizer(input, " ");

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            map = new int[h+1][w+1];
            visit = new boolean[h+1][w+1];

            for(int i=1; i<=h; i++) {
                st = new StringTokenizer(br.readLine()," ");

                for(int j=1; j<=w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            count = 0;

            for(int i=1; i<=h; i++) {
                for(int j=1; j<=w; j++) {
                    if(map[i][j] == 1 && visit[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            sb.append(count).append("\n");

        }

        System.out.println(sb.toString());
    }

    public static void dfs(int x, int y) {

        visit[x][y] = true;

        for(int i=0; i<8; i++) {

            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx > 0 && ny > 0 && nx <= h && ny <= w) {
                if(map[nx][ny] == 1 && visit[nx][ny] == false) {
                    dfs(nx, ny);
                }
            }
        }

    }
    
}
