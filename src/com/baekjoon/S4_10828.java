package com.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10828 {

    static Stack<String> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String input = br.readLine();

            switch(input.split(" ")[0]) {
                case "push" : stack.push(input.split(" ")[1]); break;
                case "pop" :  pop(); break;
                case "size" : sb.append(stack.size()).append("\n"); break;
                case "empty" : isEmpty(); break;
                case "top" : top(); break;
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void pop() {
        if(stack.isEmpty()) {
            sb.append("-1").append("\n");
        } else {
            sb.append(stack.pop()).append("\n");
        }
    }

    public static void isEmpty() {
        if(stack.isEmpty()) {
            sb.append("1");
        } else {
            sb.append("0");
        }

        sb.append("\n");
    }

    public static void top() {
        if(stack.isEmpty()) {
            sb.append("-1").append("\n");
        } else {
            sb.append(stack.peek()).append("\n");
        }
    }

}
