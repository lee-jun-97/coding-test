package com.baekjoon;

import java.util.Scanner;

public class S5_2609 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        scan.close();

        System.out.println(gcd(Math.max(n1, n2), Math.min(n1, n2)));

        System.out.println((n1 * n2) / gcd(Math.max(n1, n2), Math.min(n1, n2)));


    }

    static int gcd(int a, int b) {

        if(b == 0) {
            return a;
        }

        return gcd(b, a%b);        
    }

}
