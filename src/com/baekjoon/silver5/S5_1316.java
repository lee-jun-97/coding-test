package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S5_1316 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];

        int count = 0;
        for(int i=0; i<num; i++) {
            arr[i] = br.readLine();
            if(check(arr[i])) {
                count++;
            };
        }

        System.out.println(count);
    }

    static boolean check(String str) {

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            if(!stack.contains(str.charAt(i))) {
                stack.add(str.charAt(i));
            } else if(stack.peek() == str.charAt(i)) {
                stack.add(str.charAt(i));
            } else {
                return false;
            }
        }

        return true;
    }
    
}
