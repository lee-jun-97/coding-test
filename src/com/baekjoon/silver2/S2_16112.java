package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S2_16112 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        List<Long> list = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(list);

        long sum = 0;
        int count = 1;
        for(int i=1; i<n; i++) {
            if(count < k) {
                sum += (list.get(i) * count);
                count++;
            } else {
                sum += (list.get(i) * count);
            }
        }

        System.out.println(sum);
    }
}
