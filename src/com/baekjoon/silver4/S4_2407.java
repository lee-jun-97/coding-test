package com.baekjoon.silver4;

import java.math.BigInteger;
import java.util.Scanner;

public class S4_2407 {
    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int m = scan.nextInt();

            scan.close();

            // int 사용하면 Overflow 발생함.
            // 그래서 Long 사용했지만 그래도 부족함.
            // 그래서 BigInteger 사용함.
            BigInteger p = BigInteger.ONE;
            BigInteger c = BigInteger.ONE;

            for(int i=0; i<m; i++) {
                p = p.multiply(new BigInteger(String.valueOf(n-i)));
                c = c.multiply(new BigInteger(String.valueOf(i+1)));
            }

            System.out.println(p.divide(c));
    }

}
