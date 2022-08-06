package com.baekjoon.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class G4_1987 {

    static char[][] map;

    // 상, 하, 좌, 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static Set<Character> set = new HashSet<>();

    static int r;
    static int c;
    static int answer = Integer.MIN_VALUE;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];

        for(int i=0; i<r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        dfs(0, 0, 0);

        System.out.println(answer);

    }

    public static void dfs(int x, int y, int count) {

        // 백트래킹 알고리즘 핵심 로직 1
        // 이를 제외한 나머지 로직은 DFS 로직과 유사
        if(set.contains(map[x][y])) {
            answer = Math.max(answer, count);
            return;
        }
        
        set.add(map[x][y]);

        for(int i=0; i<4; i++) {

            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && ny >= 0 && nx < r && ny < c) {
                dfs(nx, ny, count + 1);
            }
        }

        // 백트래킹 알고리즘 핵심 로직 2
        // 백트래킹 알고리즘 사용 위해 방문 알파벳 제거
        set.remove(map[x][y]);

    }
}
