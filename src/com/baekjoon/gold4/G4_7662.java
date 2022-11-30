package com.baekjoon.gold4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class G4_7662 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        
        for(int i=0; i<tc; i++) {
            
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            
            int n = Integer.parseInt(br.readLine());

            for(int j=0; j<n; j++) {

                String[] input = br.readLine().split(" ");

                if(input[0].equals("I")) {
                    tm.put(Integer.parseInt(input[1]), tm.getOrDefault(Integer.parseInt(input[1]), 0) + 1);
                } else {
                    
                    if(!tm.isEmpty()) {
                        
                        if(input[1].equals("-1")) {
                            int num = tm.firstKey();
                            int cnt = tm.get(num);
                            
                            if(cnt == 1) {
                                tm.remove(num);
                            } else {
                                tm.put(num, cnt - 1);
                            }
                        } else {
                            int num = tm.lastKey();
                            int cnt = tm.get(num);
                            
                            if(cnt == 1) {
                                tm.remove(num);
                            } else {
                                tm.put(num, cnt - 1);
                            }
                        }
                    }
                }

            }

            if(tm.isEmpty()) {
                sb.append("EMPTY");
            } else {
                sb.append(tm.lastKey() + " " + tm.firstKey());
            }
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());

    }
}
