package com.baekjoon;

import java.util.Scanner;

public class S5_1316 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String[] arr = new String[num];

        for(int i=0; i<num; i++) {
            arr[i] = scan.nextLine();
        }

        for(String str : arr) {
            for(int i=0; i<str.length(); i++) {
                char[] chArr = new char[str.length()];

                chArr[i] = str.charAt(i);

                if(i < str.length()) {
                    
                }
                
            }
        }


    }
    
}
