package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S3_17952 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();

        int result = 0;

        for(int i=0; i<n; i++) {

            String[] input = br.readLine().split(" ");

            if(input[0].equals("0")) {

                if(stack.isEmpty()) {
                    continue;
                } else {
                    int[] arr = stack.pop();

                    arr[1]--;

                    if(arr[1] == 0) {
                        result += arr[0];
                    } else {
                        stack.push(arr);
                    }
                }

            } else {

                int score = Integer.parseInt(input[1]);
                int time = Integer.parseInt(input[2]);

                time--;
                
                if(time == 0) {
                    result += score;
                } else {
                    stack.push(new int[] { score, time });
                }
                    
            }

        }

        System.out.println(result);
    }
}
