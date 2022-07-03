package com.baekjoon.silver5;

import java.util.Scanner;

public class S5_7568 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] input = new int[n][2];

        for(int i=0; i<n; i++) {
            input[i][0] = scan.nextInt();
            input[i][1] = scan.nextInt();
        }
        
        scan.close();

        StringBuilder sb = new StringBuilder();

        
        for(int[] i : input) {

            int rank = 1;

            for(int j=0; j<input.length; j++) {
                
                if((i[0] < input[j][0]) && (i[1] < input[j][1])) {
                    rank++;
                }
    
            }

            sb.append(Integer.toString(rank) + " ");

        }

        System.out.println(sb.toString());

    }

}
