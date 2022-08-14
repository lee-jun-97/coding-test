package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S1_2504 {

    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int result = 0;
        int sum  = 1;

        for(int i=0; i<input.length(); i++) {

            char temp = input.charAt(i); 
            
            if(temp == '(') {
                stack.push(temp);
                sum *= 2;
            } else if(temp == '[') {
                stack.push(temp);
                sum *= 3;
            } else if(temp ==')') {
                if(stack.isEmpty() || stack.peek() != '(') { 
                    result = 0;
                    break;
                } else if(input.charAt(i-1) == '(') {
                    result += sum;
                }
                stack.pop();
                sum /= 2;
            } else if(temp ==']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                } else if (input.charAt(i - 1) == '[') {
                    result += sum;
                }
                stack.pop();
                sum /= 3;
            }
        }

        if(!stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }

    }

}
