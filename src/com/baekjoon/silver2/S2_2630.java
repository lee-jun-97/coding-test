package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S2_2630 {

    static String[][] paper;
    static int blue = 0;
    static int white = 0;
    static int n;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        paper = new String[n][n];

        for(int i=0; i<n; i++) {
            paper[i] = br.readLine().split(" ");
        }

        recursion(0,0,n);

        System.out.println(white);
        System.out.println(blue);
        
    }

    static void recursion(int x, int y, int size) {
        

        if(colorCheck(x, y, size)) {
            if(paper[x][y].equals("1")) {
                blue++;
            } else {
                white++;
            }

            return;
        }

        // 왼쪽 위
        recursion(x, y, size/2);
        // 오른쪽 위
        recursion(x, y + size/2, size/2);
        // 왼쪽 아래
        recursion(x + size/2, y, size/2);
        // 오른쪽 아래
        recursion(x + size/2, y + size/2, size/2 );

    }

    static boolean colorCheck(int x, int y, int size) {

        String first_color = paper[x][y];

        for(int i=x; i<x + size; i++) {
            for(int j=y; j<y + size; j++) {
                if(!paper[i][j].equals(first_color)) {
                    return false;
                }
            }
        }

        return true;
    }
    
}
