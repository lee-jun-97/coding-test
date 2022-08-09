package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S3_1874 {

    static Stack<Integer> stack = new Stack<>();
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        int curNum = 0;

        for(int i=0; i<n; i++) {
            int input = Integer.parseInt(br.readLine());

            if(curNum < input) {
                for(int j=curNum+1; j<=input; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                curNum = input;
            } else {
                if(stack.peek() != input) {
                    sb = new StringBuilder();
                    System.out.println("NO");
                    return ;
                }
            }
            
            stack.pop();
            sb.append("-").append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
