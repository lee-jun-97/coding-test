package com.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class S4_2407 {
    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int m = scan.nextInt();

            scan.close();

            BigInteger p = BigInteger.ONE;
            BigInteger c = BigInteger.ONE;

            for(int i=0; i<m; i++) {
                p = p.multiply(new BigInteger(String.valueOf(n-i)));
                c = c.multiply(new BigInteger(String.valueOf(i+1)));
            }

            System.out.println(p.divide(c));
    }

}
