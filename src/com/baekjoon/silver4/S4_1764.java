package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class S4_1764 {
    
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");

        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<Integer.parseInt(temp[0]); i++){
            set.add(br.readLine());
        }

        int count = 0;
        for(int i=0; i<Integer.parseInt(temp[1]); i++) {
            String input = br.readLine();
            if(set.contains(input)) {
                list.add(input);
                count++;
            };
        }

        Collections.sort(list);

        System.out.println(count);
        for(String i : list) {
            System.out.println(i);
        }

    }

}
