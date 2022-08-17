package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1244 {

    static boolean[] arr;
    static int n;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        
        arr = new boolean[n+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken())==1?true:false;
        }

        int m = Integer.parseInt(br.readLine());
        
        for(int i=0; i<m; i++) {

            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int button = Integer.parseInt(st.nextToken());

            solve(gender, button);
        }

        for(int i=1; i<=n; i++) {
            sb.append(arr[i]==true?1:0);
            if(i % 20 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }

        System.out.println(sb);

    }

    public static void solve(int gender, int button) {

        if(gender == 1) {
            man(button);
        } else {
            woman(button);
        }

    }

    public static void man(int button) {

        int temp = button;

        while(button < n+1) {
            arr[button] = !arr[button];
            button += temp;
        }

    }

    public static void woman(int button) {

        arr[button] = !arr[button];

        int prev = button - 1;
        int next = button + 1;

        while(prev > 0 && next <= n) {

            if(arr[prev] == arr[next]) {
                arr[prev] = !arr[prev];
                arr[next] = !arr[next];
                prev--;
                next++;
            } else {
                break;
            }
        }
    }

}
