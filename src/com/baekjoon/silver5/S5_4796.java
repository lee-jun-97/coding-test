package com.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_4796 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int i = 1;

        while(true) {
            String str = br.readLine();
            if(str.equals("0 0 0")) {
                break;
            }

            String[] input = str.split(" ");

            int count = cal(input);

            String result = "Case " + i + ": " + count;
            sb.append(result).append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        
    }

    static int cal(String[] input) {

        int count = 0;

        int l = Integer.parseInt(input[0]);
        int p = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        count = (v / p) * l ;
        if((v%p) <= l) {
            count += (v % p);
        } else {
            count += l;
        }

        return count;
    }

}
