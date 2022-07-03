package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S4_11656 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());
        List<String> list = new ArrayList<>();

        int n = sb.length();

        // list에 맨 처음 값이 안 들어가서 바로 넣어줌.
        list.add(sb.toString());

        // 맨 앞 자리 하나씩 지움.
        for(int i=0; i<n-1; i++) {
            list.add(sb.deleteCharAt(0).toString());
        }

        Collections.sort(list);

        sb = new StringBuilder();

        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        
    }

}
