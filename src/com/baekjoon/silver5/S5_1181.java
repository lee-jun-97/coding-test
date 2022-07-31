package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class S5_1181 {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        String[] arr = new String[n];
        
        scan.nextLine();
        
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextLine();
        }

        scan.close();
        
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(arr[0]);
        
        for(int i=1; i<n; i++) {
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }

        // 방법 2
        // BufferedReader + List + StringBuilder 

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        
        // int n = Integer.parseInt(br.readLine());
        
        // List<String> list = new ArrayList<>();
        
        // for(int i=0; i<n; i++) {
        //     String temp = br.readLine();
        //     if(!list.contains(temp)) {
        //         list.add(temp);
        //     }
        // }
        
        // Collections.sort(list, new Comparator<String>() {
        //     public int compare(String s1, String s2) {
        //         if(s1.length() == s2.length()) {
        //             return s1.compareTo(s2);
        //         } else {
        //             return s1.length() - s2.length();
        //         }
        //         }
        //     });
            
        //     for(String str : list) {
        //         sb.append(str).append("\n");
        //     }
            
        //     System.out.println(sb.toString());
            
        }
        
    }