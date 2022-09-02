package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class S2_2257 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        map.put('H', 1);
        map.put('C', 12);
        map.put('O', 16);

        int sum = 0;
        
        for(char c : input) {
            if(c == '(') {
                stack.push(0);
            } else if(c != ')' && !isNum(c)) {
                stack.push(map.get(c));
            } else if(isNum(c)) {
                stack.push(stack.pop() * changeChar(c));
            } else if(c == ')') {
                int temp = 0;
                while(stack.peek() != 0) {
                    temp += stack.pop();
                }
                stack.pop();
                stack.push(temp);
            }
        }

        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

    public static int changeChar(char c) {
        return c - '0';
    }

    public static boolean isNum(char c) {

        if(changeChar(c) > 0 && changeChar(c) <= 9) {
            return true;
        } else {
            return false;
        }

    }
}
