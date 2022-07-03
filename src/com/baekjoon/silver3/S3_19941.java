package com.baekjoon.silver3;

import java.util.Scanner;

public class S3_19941 {

    // 포기
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        String input = scan.next();

        scan.close();

        int result = 0;

        for(int i = 0; i < n; i++) {
            if (input.charAt(i) == 'H') {
                for(int j = 0; j < k; j++) {
                    if(input.charAt(i+j) == 'P') {
                        result++;
                        break;
                    }
                }
            }
        }

        System.out.println(result);

    }
    
}
