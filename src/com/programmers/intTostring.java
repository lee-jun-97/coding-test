package com.programmers;

import java.util.Scanner;

public class intTostring {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        scan.close();

        int answer = 0;

        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0; i<num.length; i++) {
            s = s.replaceAll(num[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);

        System.out.println(answer);
    }
    
}
