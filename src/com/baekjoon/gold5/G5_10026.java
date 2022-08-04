package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class G5_10026 {
    
    static char[][] map;
    static int normal;
    static int rg;
    static int n;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static boolean[][] visit;

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new char[n][n];
        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        normal = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(visit[i][j] == false) {
                    dfs(i,j);
                    normal++;
                }
            }
        }

        rg = 0;

        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i][j] == 'R') {
                    map[i][j] = 'G';
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(visit[i][j] == false) {
                    dfs(i,j);
                    rg++;
                }
            }
        }

        System.out.println(normal + " " + rg);
    }

    public static void dfs(int x, int y) {

        visit[x][y] = true;

        char temp = map[x][y];

        for(int i=0; i<4; i++) {

            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                char ntemp = map[nx][ny];

                if(temp == ntemp && visit[nx][ny] == false) {
                    dfs(nx, ny);
                }

            }

        }

    }
}
