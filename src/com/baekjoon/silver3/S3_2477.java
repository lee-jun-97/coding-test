package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S3_2477 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int width = 0;
        int width_idx = 0;
        int height = 0;
        int height_idx = 0;
        
        ArrayList<ArrayList<int[]>> list = new ArrayList<>();

        for(int i=0; i<6; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0; i<6; i++) {
            st = new StringTokenizer(br.readLine()," ");

            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            list.get(i).add(new int[] {direction, length});

            if(direction == 1 || direction == 2) {
                width = Math.max(width, length);
                if(width == length) {
                    width_idx = i;
                }
            } else if (direction == 3 || direction == 4) {
                height = Math.max(height, length);
                if(height == length) {
                    height_idx = i;
                }
            }
        }

        int temp_height = Math.abs(list.get(width_idx-1<0?5:width_idx-1).get(0)[1] - list.get(width_idx+1>5?0:width_idx+1).get(0)[1]);
        int temp_width = Math.abs(list.get(height_idx-1<0?5:height_idx-1).get(0)[1] - list.get(height_idx+1>5?0:height_idx+1).get(0)[1]);

        int mul = width * height;
        int temp_mul = temp_width * temp_height;


        System.out.println((mul - temp_mul) * n);
    }

}
