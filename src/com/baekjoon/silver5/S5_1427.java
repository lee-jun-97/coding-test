package com.baekjoon.silver5;

import java.util.Arrays;
import java.util.Scanner;

public class S5_1427 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        scan.close();

        char[] arr = input.toCharArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }

    }

}
