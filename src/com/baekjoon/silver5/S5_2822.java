package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S5_2822 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<8; i++) {
            int input = Integer.parseInt(br.readLine());
            map.put(input, i+1);
            list.add(input);
        }

        Collections.sort(list, Collections.reverseOrder());

        int sum = 0;
        List<Integer> numList = new ArrayList<>();
        for(int i=0; i<5; i++) {
            sum += list.get(i);
            numList.add(map.get(list.get(i)))            ;
        }

        Collections.sort(numList);

        sb.append(sum).append("\n");

        for(int i=0; i<numList.size(); i++) {
            sb.append(numList.get(i)).append(" ");
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        
    }

}
