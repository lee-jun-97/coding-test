package com.baekjoon.gold5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Location {

    int h;
    int n;
    int m;

    Location(int h, int n, int m) {
        this.h = h;
        this.n = n;
        this.m = m;
    }
}

public class G5_7569 {

    static int[][][] graph;
    static boolean[][][] visit;

    // 상, 하, 좌, 우, 위, 아래
    static int[] dm = {0, 0, -1, 1, 0, 0};
    static int[] dn = {1, -1, 0, 0, 0, 0};
    static int[] dh = {0, 0, 0, 0, 1, -1};

    static int m;
    static int n;
    static int h;

    static int date = 0;
    static int greenTomato = 0;

    static Queue<Location> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();

        graph = new int[h][n][m];
        visit = new boolean[h][n][m];

        for(int i=0; i<h; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<m; k++) {
                    graph[i][j][k] = sc.nextInt();
                    if(graph[i][j][k] == 0) {
                        greenTomato++;
                    } else if(graph[i][j][k] == 1) {
                        queue.add(new Location(i, j, k));
                    }
                }
            }
        }

        sc.close();

        bfs();
        
        System.out.println(greenTomato == 0 ? date : -1 );
    }

    public static void bfs() {
        
        while(greenTomato > 0 && !queue.isEmpty()) {

            int temp = queue.size();

            for(int i=0; i<temp; i++) {
                
                Location loc = queue.poll();
                
                for(int j=0; j<6; j++) {

                    int nm = dm[j] + loc.m;
                    int nn = dn[j] + loc.n;
                    int nh = dh[j] + loc.h;

                    if(nm < m && nn < n && nh < h && nm >= 0 && nn >= 0 && nh >= 0) {
                        if(graph[nh][nn][nm] == 0) {
                            greenTomato--;
                            graph[nh][nn][nm] = 1;
                            queue.add(new Location(nh, nn, nm));
                        }
                    }
                }
            }
            date++;
        }
    }
}
