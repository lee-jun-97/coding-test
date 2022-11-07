package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S4_10845 {

    static Queue<String> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            switch(cmd) {
                case "push" : queue.add(st.nextToken()); break;
                case "pop" : pop(); break;
                case "size" : sb.append(queue.size()).append("\n"); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }
        
        // 아무것도 없을 때 StringBuilder의 마지막 값을 지우는 행동을 해서 StringIndexOutOfBounds Exception 발생
        // StringBuilder에 \n 넣더라도 지우지 않고 바로 출력하자.
        // sb.deleteCharAt(sb.length()-1);
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
            int size = queue.size();
            for(int i=0; i<size-1; i++) {
                queue.add(queue.poll());
            }
            String temp = queue.poll();
            sb.append(temp).append("\n");
            queue.add(temp);
        }
    }

}
