package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class G5_11000 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static PriorityQueue<Integer> queue = new PriorityQueue<>();
    static boolean[] visit;

    static int count;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<=n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            list.get(s).add(t);
            list.get(t).add(s);

            queue.add(s);
            queue.add(t);
        }

        while(!queue.isEmpty()) {
            dfs(queue.peek());
            count++;
        }

        System.out.println(count);

    }

    public static void dfs(int start) {

        visit[start] = true;

        queue.remove(start);

        for(int i=0; i<list.size(); i++) {
            int temp = list.get(start).get(i);
            if(visit[temp] == false) {
                dfs(temp);
            }
        }

    }
}
