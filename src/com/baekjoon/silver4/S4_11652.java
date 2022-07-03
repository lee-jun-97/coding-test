package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;


public class S4_11652 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 입력 값의 범위가 2의 -62제곱 ~ 2의 62제곱 이므로 Long 사용.
        HashMap<Long, Integer> map = new HashMap<>();

        // BufferedReader로 읽어온 값들은 map에 추가함.
        for(int i=0; i<n; i++) {
            Long input = Long.parseLong(br.readLine());
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        int max = 0;
        // list의 값들을 map에 있는 value들로 초기값 지정함.
        ArrayList<Integer> list = new ArrayList<>(map.values());
        for(Integer cnt : list) {
            if(max < cnt) {
                max = cnt ;
            }
        }

        // 같은 경우 가장 작은 수 출력하기 위해 우선순위 Queue 사용.
        PriorityQueue<Long> queue = new PriorityQueue<>();
        // map의 키와 밸류를 서로 뒤바꾸기 위해 map.keySet() 사용.
        // 뒤바꾼 후 키와 최대값인 max를 비교하여 우선순위 Queue에 저장.
        for(Long key : map.keySet()) {
            if(max == map.get(key)) {
                queue.add(key);
            };
        }

        // Queue 헤드 값 출력.
        System.out.println(queue.poll());

    }

}
