package com.baekjoon.silver5;

import java.util.Scanner;

public class S5_1436 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        // 왜 index를 6으로 하여 탐색한 후 666으로 변경할 시에는 안 되는가
        // index = index.replaceFisrt("6", "666");
        int index = 666;
        int i = 1;

        while(true) {
            if(String.valueOf(index).contains("666")) {
                if(i == n) {
                    System.out.println(index);
                    break;
                }
                i++;
            }

            index++;
        }
        
    }
}
