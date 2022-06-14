package com.baekjoon;

import java.util.Scanner;

public class S5_1476 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int e = scan.nextInt();
        int s = scan.nextInt();
        int m = scan.nextInt();

        scan.close();

        // 왜 0 으로 해야 맞을까
        int year = 0;
        int E = 0;
        int S = 0;
        int M = 0;


        while(true) {

            year++;
            E++;
            S++;
            M++;
            
            if(E%16 == 0) {
                E = 1;
            }
            if(S%29 == 0) {
                S = 1;
            }
            if(M%20 == 0) {
                M = 1;
            }


            if(E == e && S == s && M ==m ) {
                break;
            }
        }

        System.out.println(year);
    }
}
