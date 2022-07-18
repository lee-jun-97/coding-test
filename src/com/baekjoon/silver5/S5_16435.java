package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S5_16435 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        Collections.sort(list);

        for(int i=0; i<n; i++) {
            if(list.get(i) <= l) {
                l++;
            }
        }
        
        System.out.println(l);

    }
    
}
