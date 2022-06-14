package com.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class S5_1475 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        scan.close();

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] result = { 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<arr.length; j++) {
                if((str.charAt(i) -'0' == 6) || (str.charAt(i) - '0' == 9)) {
                    result[6]++;
                    break;
                } else if((str.charAt(i) - '0') == arr[j]) {
                    result[j]++;
                    break;
                }
            }
        }

        if(result[6] % 2 == 0 ) {
            result[6] /= 2;
        } else {
            result[6] /= 2;
            result[6]++;
        }

        Arrays.sort(result);

        System.out.println(result[8]);

    }

}
