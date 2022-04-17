package com.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S5_4796 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> strList = new ArrayList<>();

        while(true) {
            int i = 1;
            String c = scan.nextLine();

            if ( c.equals("0 0 0")) {
                break;
            }

            strList.add(cal(c, i));
            i++;
        }

        scan.close();

        for( String str : strList ) {
            System.out.println(str);
        }        
    }

    public static String cal(String input, int i) {

        String[] strArr = input.split(" ");

        int L = Integer.parseInt(strArr[0]);
        int P = Integer.parseInt(strArr[1]);
        int V = Integer.parseInt(strArr[2]);

        int result = (V / P) * L + Math.min((V % P), L ) ;
    
        return "Case " + i + ": " + result; 
    }
    
}
