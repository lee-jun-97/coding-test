package com.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_11053 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] result = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(result, 1);

        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j]) {
                    result[i] = Math.max(result[i], result[j]+1);
                }
            }
        }

        int max = -1;
        for(int i=0; i<n; i++) {
            max = Math.max(max, result[i]);
        }

        System.out.println(max);

        // 왜 stack을 사용한 내 로직은 안 되는가 
        /*
        int result = 0;

        for(int i=0; i<n; i++) {
            stack.push(arr[i]);

            for(int j=0; j<i; j++) {
                int temp = stack.peek();
                if(temp < arr[j]) {
                    stack.push(arr[j]);
                }
            }
            result = Math.max(result, stack.size());
            stack.clear();
        }

        System.out.println(result);
        */
    }
}
