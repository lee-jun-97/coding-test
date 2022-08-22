package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S3_1448 {

    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());

        int result = 0;

        for(int i=0; i<n-2; i++) {
            int sum = list.get(i+1) + list.get(i+2);
            if(list.get(i) < sum) {
                result = Math.max(result, sum + list.get(i));
            }
        }

        System.out.println(result==0?-1:result);

    }
    
}