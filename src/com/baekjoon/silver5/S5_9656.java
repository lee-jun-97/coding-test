package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_9656 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n%2 == 0) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
