package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class G5_15927 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        boolean check = false;
        
        int length = input.length();

        for(int i=0; i<length/2; i++) {
            // 대칭 되는 위치의 Character 값이 같지 않으면 팰린드롬 아님.
            if(input.charAt(i) != input.charAt(length-1 - i)) {
                System.out.println(length);
                return;
            // 다음 문자가 다르면 모두 같은 문자가 아님.
            } else if(input.charAt(i) != input.charAt(i + 1)) {
                check = true;
            }
        }

        // 한가지 문자로 이루어져 있지 않고 팰린드롬임.
        if(check) {
            System.out.println(length - 1);
        // 한가지 문자로 이루어져 있음.
        } else {
            System.out.println(-1);
        }
    }
}
