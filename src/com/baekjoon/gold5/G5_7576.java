package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_7576 {

    static Queue<int []> queue = new LinkedList<>();

    
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    
    static int[][] box;

    static int count = 0;
    static int zero_cnt = 0;

    static int m;
    static int n;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine()," ");

            for(int j=1; j<=m; j++) {
                int temp = Integer.parseInt(st.nextToken());
                box[i][j] = temp;
                if(temp == 1) {
                    queue.add(new int[] {i, j});
                } else if(temp == 0) {
                    zero_cnt++;
                }
            }
        }

        bfs();

        if(zero_cnt == 0) {
            System.out.println(count-1);
        } else {
            System.out.println(-1);
        }

    }

    public static void bfs() {
        
        while(!queue.isEmpty()) {

            int size = queue.size();

            for(int i=0; i<size; i++) {
                
                int[] arr = queue.poll();
            
                int x = arr[0];
                int y = arr[1];
                
                for(int j=0; j<4; j++) {
                    
                    int nx = dx[j] + x;
                    int ny = dy[j] + y;

                    if(nx > 0 && ny > 0 && ny <= m && nx <= n) {
                        if(box[nx][ny] == 0) {
                            zero_cnt--;
                            box[nx][ny] = 1;
                            queue.add(new int[] {nx, ny});
                        }
                    }
                }
            }
            count++;
        }
    }

}
