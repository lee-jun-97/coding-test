package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_1697 {

    static Queue<Integer> queue = new LinkedList<>();
    static int[] arr = new int[100001];
    static int n;
    static int k;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if(n >= k) {
            System.out.println(n - k);
        } else {
            bfs(n, 0);
            System.out.println(arr[k]);
        }

    }

    public static void bfs(int start, int count) {

        queue.offer(start);
        
        arr[start] = count;
        
        int node = 0;

        while(!queue.isEmpty()) {

            int temp = queue.poll();
            
            for(int i=0; i<3; i++) {

                if(i == 0){
                    node = temp + 1;
                } else if(i == 1) {
                    node = temp - 1;
                } else {
                    node = temp * 2;
                }

                if(node >= 0 && node < 100001) {
                    if(arr[node] == 0) {
                        queue.offer(node);
                        arr[node] = arr[temp] + 1;
                    }
                }

                if(node == k) {
                    break;
                }
            }
        }

    }
}
