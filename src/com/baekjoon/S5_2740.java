package com.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S5_2740 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a_size = br.readLine().split(" ");

        String[][] a = new String[Integer.parseInt(a_size[0])][Integer.parseInt(a_size[1])];

        for(int i=0; i<Integer.parseInt(a_size[0]); i++) {
            a[i] = br.readLine().split(" ").clone();
        }

        String[] b_size = br.readLine().split(" ");

        String[][] b = new String[Integer.parseInt(b_size[0])][Integer.parseInt(b_size[1])];

        for(int i=0; i<Integer.parseInt(b_size[0]); i++) {
            b[i] = br.readLine().split(" ").clone();
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<Integer.parseInt(a_size[0]); i++) {
            int sum = 0;
            for(int j=0; j<Integer.parseInt(b_size[0]); j++) {
                sum += Integer.parseInt(a[i][j])*Integer.parseInt(b[i][j]);
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
