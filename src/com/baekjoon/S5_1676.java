package com.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class S5_1676 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        scan.close();

        BigInteger sum = new BigInteger("1");

        for(int i=1; i<=n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        String str = sum.toString();
        int cnt = 0;

        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == '0') {
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);
    }
}
