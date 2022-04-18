package com.baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S5_9237 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        Integer[] dateArr = new Integer[n] ;

        for (int i=0; i < n; i++) {
            dateArr[i] = scan.nextInt();
        }
        scan.close();

        int result = 0;
        int cnt = 2;

        Arrays.sort(dateArr, Collections.reverseOrder());

        for ( int i=0; i < dateArr.length; i++) {
            result = Math.max(result, dateArr[i] + cnt);
            cnt++;
        }

        System.out.println(result);
        
    }
    
}
