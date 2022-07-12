package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_4949 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {

            String input = br.readLine();

            if(input.equals(".")) {
                break;
            }

            String result = solve(input);

            sb.append(result).append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

    public static String solve(String str) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c == '[' || c =='(') {
                stack.push(c);
            }

            // stack.empty 를 먼저 체크해주어야 함.
            // 논리 연산자 전후로 순서 바꾸면 EmptyStack Exception 발생함.
            if(c == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }

}
