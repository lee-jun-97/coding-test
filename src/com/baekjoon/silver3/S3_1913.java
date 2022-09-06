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

        boolean direction = false;

        while(true) {

            arr[x][y]  = num;

            if(direction) {
                for(int i=1; i<=count; i++) {
                    x++;
                    if(x >= 0 && x < n) {
                        arr[x][y] = ++num;
                        if(num == goal) {
                            goal_x = x;
                            goal_y = y;
                        }
                    } else {
                        break;
                    }
                }

                if(num == n*n) {
                    break;
                }

                for(int i=1; i<=count; i++) {
                    y--;
                    if(y >= 0 && y < n) {
                        arr[x][y] = ++num;
                        if(num == goal) {
                            goal_x = x;
                            goal_y = y;
                        }
                    } else {
                        break;
                    }
                }

                if(num == n*n) {
                    break;
                }

            } else {
                for(int i=1; i<=count; i++) {
                    x--;
                    if(x >= 0 && x < n) {
                        arr[x][y] = ++num;
                        if(num == goal) {
                            goal_x = x;
                            goal_y = y;
                        }
                    } else {
                        break;
                    }
                }

                if(num == n*n) {
                    break;
                }

                for(int i=1; i<=count; i++) {
                    y++;
                    if(y >= 0 && y < n) {
                        arr[x][y] = ++num;
                        if(num == goal) {
                            goal_x = x;
                            goal_y = y;
                        }
                    } else {
                        break;
                    }
                }

                if(num == n*n) {
                    break;
                }
                
            }
            count++;
            direction = !direction;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println((goal_x + 1) + " " + (goal_y + 1));
    }
}
