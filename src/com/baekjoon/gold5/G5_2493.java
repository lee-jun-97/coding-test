package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class G5_2493 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<int[]> stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++) {

            int num = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()) {

                if(num < stack.peek()[0]) {
                    sb.append(stack.peek()[1] + " ");
                    break;
                }
                stack.pop();
            }

            if(stack.empty()) {
                sb.append("0 ");
            }

            stack.push(new int[] {num, i+1});

        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

}
