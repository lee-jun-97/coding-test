package com.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S5_11866 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        scan.close();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        for(int i=0; i<n; i++) {
            queue.add(i+1);
        }

        while(!queue.isEmpty()) {
            for(int i=0; i<k-1; i++) {
                int temp = queue.poll();
                queue.add(temp);
            }

            sb.append(queue.poll());

            if(!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");

        System.out.println(sb.toString());
    }
    
}
