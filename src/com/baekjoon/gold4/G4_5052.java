package com.baekjoon.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class G4_5052 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            List<String> list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++) {
                list.add(br.readLine());
            }

            Collections.sort(list);

            boolean check = true;

            for(int j=0; j<list.size()-1; j++) {
                if(list.get(j+1).startsWith(list.get(j))) {
                    check = false;
                    break;
                }
            }

            if(check) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    
}