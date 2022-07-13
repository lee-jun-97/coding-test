package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S2_1874 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cur = 1;

        for(int input : arr) {

            if(input > cur) {
                for(int j=cur; j<=input; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
                cur = input+1;
            } else {
                if(!stack.isEmpty() && stack.peek() == input) {
                    stack.pop();
                    sb.append("-").append("\n");
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            }

        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
