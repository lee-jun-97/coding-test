package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S3_11726 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // n 이 1이 입력되었을 시 arr[2]는 접근할 수 없어 ArrayIndexOutOfBoundsException 발생.
        // n+1의 크기로 배열 선언할 시 초기값을 arr[0] 과 arr[1] 만 설정해야 함.
        int[] arr = new int[n+1];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<=n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }

        System.out.println(arr[n]);
    }

}
