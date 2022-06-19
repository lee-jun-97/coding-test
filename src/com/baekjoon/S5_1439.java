package com.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1439 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, "0");
        StringTokenizer st1 = new StringTokenizer(str, "1");

        System.out.println(Math.min(st.countTokens(), st1.countTokens()));

    }

}
