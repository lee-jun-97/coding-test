package com.baekjoon.silver5;

import java.util.Scanner;

public class S5_9655 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        if(n%2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }

}
