package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1074 {

    static int result = 0;
    static int[][] map;

    static int n, r, c;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        recruit((int)Math.pow(2, n), r, c);
        System.out.println(result);

    }

    static void recruit(int size, int x, int y) {

        if(size == 1) {
            return;
        }

        if(x < size/2 && y < size/2) {
			recruit(size/2, x, y);
		}
		else if(x < size/2 && y >= size/2) {
			result += size * size / 4;
			recruit(size/2, x, y - size/2);
		}
		else if(x >= size/2 && y < size/2) {
			result += (size * size / 4) * 2;
			recruit(size/2, x - size/2, y);
		}
		else {
			result += (size * size / 4) * 3;
			recruit(size/2, x - size/2, y - size/2);
		}

    }
}
