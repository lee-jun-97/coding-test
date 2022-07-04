package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S3_2108 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(br.readLine());
            list.add(temp);
            map.put(temp, map.getOrDefault(temp, 0) + 1);

            sum += temp;
        }

        Collections.sort(list);

        sb.append(Math.round((double)sum/n)).append("\n");
        sb.append(list.get((n-1)/2)).append("\n");
        sb.append(maxcheck(map)).append("\n");
        sb.append(list.get(list.size()-1)-list.get(0));

        System.out.println(sb.toString());

    }

    // 최빈값 같은 값 있을 시 2번째로 작은 값 출력
    public static int maxcheck(Map<Integer,Integer> map) {

        int number = 0;

        for(int i : map.values()) {
            number = Math.max(number, i);
        }
        List<Integer> list = new ArrayList<>();
        int result = 0;

        for(int i : map.keySet()) {
            if(map.get(i) == number) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if(list.size() >= 2) {
            result = list.get(1);
        } else {
            result = list.get(0);
        }

        return result;
    }
    
}
