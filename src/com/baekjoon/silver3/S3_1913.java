package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_1913 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int goal = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        int num = 1;
        int count = 1;

        int x = n/2;
        int y = n/2;

        int goal_x = 0;
        int goal_y = 0;

        while(true) {

            for(int i=0; i<count; i++) {
                arr[x--][y] = num++;
            }

            if(num-1 == n*n) {
                break;
            }

            for(int i=0; i<count; i++) {
                arr[x][y++] = num++;
            }

            count++;

            for(int i=0; i<count; i++) {
                arr[x++][y] = num++;
            }

            for(int i=0; i<count; i++) {
                arr[x][y--] = num++;
            }

            count++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sb.append(arr[i][j]+ " ");
                if(arr[i][j] == goal) {
                    goal_x = i+1;
                    goal_y = j+1;
                }
            }
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
        System.out.println(goal_x + " " + goal_y);
    }
}
