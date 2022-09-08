package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_3613 {
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if(input.contains("_")) {
            System.out.println(toJava(input));
        } else {
            System.out.println(toC(input));
        }
    }

    public static String toJava(String input) {
        char[] arr = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        boolean check = false;

        for(int i=0; i<arr.length; i++) {

            char temp = arr[i];

            if(temp == '_') {
                if(i == 0 || i == arr.length-1) {
                    sb = new StringBuilder();
                    sb.append("Error!");
                    break;
                } else if(arr[i+1] == '_') {
                    sb = new StringBuilder();
                    sb.append("Error!");
                    break;
                } else {
                    check = !check;
                }
            } else if(temp >= 'A' && temp <= 'Z') {
                sb = new StringBuilder();
                sb.append("Error!");
                break;
            } else {
                if(check) {
                    sb.append(Character.toUpperCase(temp));
                    check = !check;
                } else {
                    sb.append(temp);
                }
            }
        }
        
        return sb.toString();
    }

    public static String toC(String input) {
    
        char[] arr = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            char temp = arr[i];

            if(temp >= 'A' && temp <= 'Z') {
                if(i == 0) {
                    sb = new StringBuilder();
                    sb.append("Error!");
                    break;
                } else {
                    sb.append("_").append(Character.toLowerCase(temp));
                }
            } else if(temp == '_') {
                sb = new StringBuilder();
                sb.append("Error!");
                break;
            } else {
                sb.append(temp);
            }
        }
        return sb.toString() ;
    }
}