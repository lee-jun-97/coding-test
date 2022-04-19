package com.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class S5_16435 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputArr = input.split(" ");

        int n = Integer.parseInt(inputArr[0]);

        int[] nArr = new int[n];

        int result = Integer.parseInt(inputArr[1]);

        for(int i=0; i < n; i++) {
            nArr[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(nArr);

        if( Integer.parseInt(inputArr[1]) < nArr[0] ) {
            result = Integer.parseInt(inputArr[1]);
        } else {
            for (int i=0; i<nArr.length; i++) {
                if(result >= nArr[i]) {
                    result += 1;
                }
            }
        }

        System.out.println(result);

    }
    
}
