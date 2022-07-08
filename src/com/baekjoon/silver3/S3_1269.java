package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S3_1269 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");

        String[] arrA = br.readLine().split(" ");
        String[] arrB = br.readLine().split(" ");

        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        for(String i : arrA) {
            setA.add(i);
        }

        for(String i : arrB) {
            setB.add(i);
        }
        
        int count = 0;

        for(String i : setA) {
            if(setB.contains(i)) {
                count++;
            }
        }

        System.out.println(setA.size() + setB.size() - (count*2));

    }

}