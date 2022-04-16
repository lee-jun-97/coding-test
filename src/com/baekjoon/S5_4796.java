package com.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S5_4796 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> strArr = new ArrayList<String>();


        while(true) {
            int i = 1;
            String c = scan.nextLine();

            if ( c.equals("0 0 0")) {
                break;
            }

            strArr.add(cal(c, i));
            i++;
        }

        scan.close();

        for( String i : strArr ) {
            System.out.println(i);
        }        
    }

    public static String cal(String input, int i) {

        String[] strArr = input.split(" ");

        List<Integer> intArr = new ArrayList<Integer>();

        for ( int j = 0 ; j < strArr.length; j++ ) {
            intArr.add(Integer.parseInt(strArr[j]));
        }

        int cnt = intArr.get(2) / intArr.get(1) ;
        int cnt2 = intArr.get(2) % intArr.get(1) ;

        int result = (cnt*intArr.get(0)) + cnt2 ;
        
        String str = "Case " + i + ": " + result; 


        return str ;
    }
    
}
