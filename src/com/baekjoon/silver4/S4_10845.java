package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S4_10845 {

    static Queue<String> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");

            switch(input[0]) {
                case "push" : queue.add(input[1]); break;
                case "pop" : pop(); break;
                case "size" : sb.append(Integer.toString(queue.size())).append("\n"); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    static void pop() {
        if(queue.isEmpty()) {
            sb.append("-1").append("\n");
        } else {
            sb.append(queue.poll()).append("\n");
        }
    }

    static void empty() {
        if(queue.isEmpty()) {
            sb.append("1").append("\n");
        } else {
            sb.append("0").append("\n");
        }
    }

    static void front() {
        if(queue.isEmpty()) {
            sb.append("-1").append("\n");
        } else {
            sb.append(queue.peek()).append("\n");
        }
    }

    static void back() {
        if(queue.isEmpty()) {
            sb.append("-1").append("\n");
        } else {
            for(int i=0; i<queue.size()-1; i++) {
                queue.add(queue.poll());
            }
            String temp = queue.poll();
            sb.append(temp).append("\n");
            queue.add(temp);
        }
    }

}
