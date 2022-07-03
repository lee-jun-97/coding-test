package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class S4_1302 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        // 입력 받은 책 갯수 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());

        // 우선순위 큐는 알파벳도 우선순위 결정해서 정렬함.
        PriorityQueue<String> queue = new PriorityQueue<>();
        for(String key : map.keySet()) {
            if(list.get(0) == map.get(key)) {
                queue.add(key);
            }
        };

        System.out.println(queue.poll());
    }

}
