package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S3_20300 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<Long> list = new ArrayList<>();

        long result = 0;

        for(int i=0; i<n; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(list);

        long last = list.get(list.size()-1);
        int size = list.size() / 2 ;

        if(list.size() % 2 == 1) {
            for(int i=0; i<size; i++) {
                long temp = list.get(i) + list.get(list.size()-2-i);
                result = Math.max(result, temp);
            }
            result = Math.max(result, last);
        } else {        
            for(int i=0; i<size; i++) {
                long temp = list.get(i) + list.get(list.size()-1-i);
                result = Math.max(result, temp);
            }
        }

        System.out.println(result);
    }
}
