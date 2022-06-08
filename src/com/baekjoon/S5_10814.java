package com.baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S5_10814 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = scan.next();
            arr[i][1] = scan.next();
        }

        scan.close();

        Arrays.sort(arr, new Comparator<String[]>() {

            // 스스로 구현한 로직
            // @Override
            // public int compare(String[] e1, String[] e2) {
            //     if(e1[0].equals(e2[0])) {
            //         return 0;
            //     } else {
            //         return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            //     }
            // }

            // 다른 사람이 작성한 코드
            // 같은 값이라면 두 값의 차를 0을 리턴하기 때문에 분기처리 안 해도 됨.
            @Override
            public int compare(String[] e1, String[] e2) {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }

}
