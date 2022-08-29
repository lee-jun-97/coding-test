package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class S3_25045 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        List<Long> item_list = new ArrayList<>();
        List<Long> com_list = new ArrayList<>();

        while(st.hasMoreTokens()) {
            item_list.add(Long.parseLong(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            com_list.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(item_list, Collections.reverseOrder());
        Collections.sort(com_list);

        long sum = 0 ;

        for(int i=0; i<Math.min(n, m); i++) {
            if((item_list.get(i) - com_list.get(i)) > 0) {
                sum += (item_list.get(i) - com_list.get(i)); 
            }
        }

        System.out.println(sum);
    }
}
