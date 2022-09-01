package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S2_1141 {
    
    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String e1, String e2) {
                return Integer.compare(e2.length(), e1.length());
            }
        });

        for(String str : list) {
            
            if(set.size() == 0) {
                set.add(str);
            }

            boolean available= true;
            
			for (String str2 : set) {
				if (str2.indexOf(str) == 0) {
					available = false;
					break;
				}
			}

			if (available) {
				set.add(str);
			}
        }

        System.out.println(set.size());
    }
}
