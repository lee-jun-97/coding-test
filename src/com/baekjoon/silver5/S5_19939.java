package com.baekjoon.silver5;

import java.util.Scanner;

public class S5_19939 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();

        scan.close();

        int result = -1;
        int max = 1;

        while(n>0) {
            n -= k;
            k--;
            
            result = max - 1 ;
            
            max++;

            if(n<k) {
                result = -1 ;
                break;
            }
        }

        System.out.println(result);
    }
    
}
