package com.baekjoon;

import java.util.Scanner;

public class S5_2581 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        scan.close();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=n1; i<=n2; i++) {

            if(isPrimeNumber(i)) {
                if(min > i ) {
                    min = i;
                }
                sum += i;
            }
            
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }

    public static boolean isPrimeNumber(int a) {
        
        for(int i=2; i<=Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }

        return true;
    }
}
