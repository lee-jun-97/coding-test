package com.baekjoon.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class G4_14499 {
    
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        int dice_y = r;
        int dice_x = c;

        // 주사위 값 저장
        LinkedList<Integer> ver = new LinkedList<>();
        LinkedList<Integer> hor = new LinkedList<>();

        int[][] map = new int[n][m];

        for(int i=0; i<4; i++) {
            ver.add(0);
            hor.add(0);
        }

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<k; i++) {
            int temp = Integer.parseInt(st.nextToken());
            
            int ny = dice_y + dy[temp-1];
            int nx = dice_x + dx[temp-1];

            if(ny >= 0 && nx >= 0 && ny < n && nx < m) {
                switch(temp) {
                    case 1 : hor.addFirst(hor.removeLast()); ver.set(1, hor.get(1)); break;
                    case 2 : hor.addLast(hor.removeFirst()); ver.set(1, hor.get(1)); break;
                    case 3 : ver.addLast(ver.removeFirst()); hor.set(1, ver.get(1)); break;
                    case 4 : ver.addFirst(ver.removeLast()); hor.set(1, ver.get(1)); break;
                }

                if(map[ny][nx] == 0) {
                    if(temp == 1 || temp == 2) {
                        ver.set(3, hor.get(3));
                    } else {
                        hor.set(3, ver.get(3));
                    }
                    map[ny][nx] = hor.get(3);
                } else {
                    hor.set(3, map[ny][nx]);
                    ver.set(3, map[ny][nx]);
                    map[ny][nx] = 0;
                }

                dice_y = ny;
                dice_x = nx;

                sb.append(hor.get(1)).append("\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());

    }
}
