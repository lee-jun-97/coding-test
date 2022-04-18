package com.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 제출 시 출력 초과 나옴 ..
public class S5_10610 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num = scan.next();
        int sum = 0 ;
        StringBuilder sb = new StringBuilder();

        scan.close();

        // 입력받은 수 char 배열로 변경
        char[] charArr = num.toCharArray();
        
        // 배열 오름차순 변경
        Arrays.sort(charArr);

        // 각 자리 수 더함 + 30의 배수 만듬
        for(int i=charArr.length-1; i >= 0; i--) {
            sum += charArr[i];
            sb.append(charArr[i]);
        }

        // 30의 배수인지 확인
        if ( sum % 3 == 0 || charArr[0] == 0 ) {
            System.out.println(sb.toString());
        } else {
            System.out.println(-1);
        }

    }
}