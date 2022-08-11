package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_9012 {

    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String input = br.readLine();

            solve(input);

            if(stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

            stack.clear();
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void solve(String input) {

        for(int i=0; i<input.length(); i++) {
            char temp = input.charAt(i);
            if(temp == ')') {
                if(stack.isEmpty()) {
                    stack.add(temp);
                } else if(stack.peek() == '(') {
                        stack.pop();
                    }
            } else {
                stack.add(temp);
            }
        }
    }

}
