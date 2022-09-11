package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_13549 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new LinkedList<>();

        int result = 0;

        queue.add(new int[] {n, 0});

        while(true) {
            int[] temp = queue.poll();

            if(temp[0] == k) {
                result = temp[1];

                for(int[] arr : queue) {
                    if(arr[0] == k) {
                        result = Math.min(result, arr[1]);
                    }
                }

                queue.clear();
                break;
            } else {
                queue.add(new int[] { temp[0] + 1, temp[1] + 1 });
                queue.add(new int[] { temp[0] - 1, temp[1] + 1 });
                queue.add(new int[] { temp[0] * 2, temp[1] });
            }
        }
        System.out.println(result);
    }
}
