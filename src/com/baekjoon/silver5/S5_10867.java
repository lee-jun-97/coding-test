package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class S5_10867 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        list = list.stream().distinct().collect(Collectors.toList());

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

}
