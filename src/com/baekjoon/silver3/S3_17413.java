package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S3_17413 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        boolean check = false;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<input.length(); i++) {

            char temp = input.charAt(i);

            if(temp == '<') {
                check = true;
            }

            if(temp == '>') {
                sb.append(temp);
                check = false;
            }
            
            if(check) {
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
                sb.append(temp);
            } else {
                if(temp == ' ') {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(temp);
                } else if(temp != '>'){
                        stack.push(temp);
                }
            }

            if(i == input.length()-1 && !stack.isEmpty()) {
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    
                }
            }
        }

        System.out.println(sb.toString());
    }

}
