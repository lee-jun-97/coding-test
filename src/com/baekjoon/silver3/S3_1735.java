package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_1735 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        int son = (Integer.parseInt(arr1[0]) * Integer.parseInt(arr2[1])) + (Integer.parseInt(arr1[1]) * Integer.parseInt(arr2[0]));
        int parent = Integer.parseInt(arr1[1]) * Integer.parseInt(arr2[1]);

        int temp = gcd(son, parent);

        System.out.println(son/temp + " " + parent/temp);
    }

    // 최대 공약수 구하는 유클리드 호제법 로직
    static int gcd(int a, int b) {

        if(b == 0) {
            return a;
        }

        return gcd(b,a%b);
    }

}
