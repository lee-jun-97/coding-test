package com.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S5_11728 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scan.nextInt();
        int m = scan.nextInt();
        // scan.next();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(scan.nextInt());
        }
        // scan.next();

        for(int i=0; i<m; i++) {
            list.add(scan.nextInt());
        }
        scan.close();

        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    
}
