package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_16234 {

    static Queue<int[]> queue = new LinkedList<>();
    
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    
    static int[][] map;
    static boolean[][] visit;
    
    static int n;
    static int l;
    static int r;

    static int date = 0;
    static int sum = 0;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        visit = new boolean[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        }

        while(true) {
            if(bfs(0, 0) == 0) {
                break;
            } else {
                date++;
            }

        }

        System.out.println(date);
        
    }

    public static int bfs(int start_x, int start_y) {
        
        int count = 0;

        List<int[]> list = new ArrayList<>();

        queue.add(new int[]{ start_x, start_y });
        sum += map[start_x][start_y];
        visit[start_x][start_y] = true;

        while(!queue.isEmpty()) {

            int[] temp = queue.poll();

            for(int i=0; i<4; i++) {

                int nx = dx[i] + start_x;
                int ny = dy[i] + start_y;

                if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    int next_temp = map[nx][ny];
                    int diff = Math.abs(next_temp - map[temp[0]][temp[1]]);
                    if(visit[nx][ny] == false && diff >= l && diff <= r) {
                        queue.add(new int[]{ nx, ny });
                        list.add(new int[]{ nx, ny });
                        sum += next_temp;
                        count++;
                    }
                }
            }
        }

        if(count != 0) {
            int after = sum / count;

            for(int i=0; i<list.size(); i++) {
                int[] temp = list.get(i);
                map[temp[0]][temp[1]] = after;
            }
        }
    
        for(int i=0; i<n; i++) {
            Arrays.fill(visit[i], false);
        }

        return count;
    }
}
