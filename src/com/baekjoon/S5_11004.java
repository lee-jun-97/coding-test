package com.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S5_11004 {
    
    // quick Selection 사용 해야 함.
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(scan.nextInt());
        }

        scan.close();

        Collections.sort(list);

        System.out.println(list.get(k-1));
    }

}
