package com.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S5_2751 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(scan.nextInt());
        }

        scan.close();

        // Arrays.sort 사용하였을 때 시간 초과 발생
        Collections.sort(list);
        
        // for 문 사용하여 출력하였을 때 시간 초과 발생 
        // StringBuilder로 한 번에 출력하여 해결
        for(int i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
