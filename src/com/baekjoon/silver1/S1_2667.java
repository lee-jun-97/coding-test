package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S1_2667 {

    static int n;
    static int[][] graph;
    static boolean[][] visit;
    static int[] dx = {0, 0, -1, 1}; // 상,하,좌,우 순
    static int[] dy = {1, -1, 0, 0};
    static int cnt = 0; // 아파트 수
    static int total = 0; // 단지 수
    static List<Integer> cnts = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visit = new boolean[n][n];

        // 집 만듬.
        for(int i=0; i<n; i++) {
            String[] temp = br.readLine().split("");

            for(int j=0; j<n; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                cnt = 0;
                if(graph[i][j] == 1 && visit[i][j] == false) {
                    total++;
                    cnt++;
                    dfs(i,j);
                    cnts.add(cnt);
                }
            }
        }

        System.out.println(total);
        Collections.sort(cnts);

        for(Integer i : cnts) {
            sb.append(i).append("\n");
        }

        System.out.println(sb.toString());
    }

    // x, y 가 순서가 바뀌는 이유
    // i : y 좌표, j 는 x 좌표임.
    public static void dfs(int y, int x) {

        visit[y][x] = true;

        for(int i=0; i<4; i++) {

            int ny = dy[i] + y;
            int nx = dx[i] + x;

            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if(graph[ny][nx] == 1 && visit[ny][nx] == false) {
                    cnt++;
                    dfs(ny,nx);
                }
            }
        }
    }
}