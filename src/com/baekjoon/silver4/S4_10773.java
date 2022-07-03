package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10773 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0) {
                stack.pop();
            } else {
                stack.add(temp);
            }
        }

        int sum = 0;
        
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

}
