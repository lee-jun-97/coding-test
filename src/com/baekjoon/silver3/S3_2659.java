package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S3_2659 {
    
    public static void main(String[] args) throws Exception {

        Set<Integer> set = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int num = makeMin(arr);        
        
        for(int a=1; a<10; a++) {
            for(int b=1; b<10; b++) {
                for(int c=1; c<10; c++) {
                    for(int d=1; d<10; d++) {
                        String[] temp = { String.valueOf(a), String.valueOf(b), String.valueOf(c), String.valueOf(d)};
                        set.add(makeMin(temp));
                    }
                }
            }
        }

        int count = 0;
        for(int i=1111; i<=num; i++) {
            if(set.contains(i)) {
                count++;
            }
        }

        System.out.println(count);
        
    }

    public static int makeMin(String[] arr) {

        int min = Integer.MAX_VALUE;

        int a = ((Integer.parseInt(arr[0]) * 1000) + (Integer.parseInt(arr[1]) * 100) + (Integer.parseInt(arr[2]) * 10) + Integer.parseInt(arr[3]));
        min = Math.min(min, a);
        int b = ((Integer.parseInt(arr[1]) * 1000) + (Integer.parseInt(arr[2]) * 100) + (Integer.parseInt(arr[3]) * 10) + Integer.parseInt(arr[0]));
        min = Math.min(min, b);
        int c = ((Integer.parseInt(arr[2]) * 1000) + (Integer.parseInt(arr[3]) * 100) + (Integer.parseInt(arr[0]) * 10) + Integer.parseInt(arr[1]));
        min = Math.min(min, c);
        int d = ((Integer.parseInt(arr[3]) * 1000) + (Integer.parseInt(arr[0]) * 100) + (Integer.parseInt(arr[1]) * 10) + Integer.parseInt(arr[2]));
        min = Math.min(min, d);

        return min;
    }

}
