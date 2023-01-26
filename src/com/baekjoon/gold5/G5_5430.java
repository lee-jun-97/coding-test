package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class G5_5430 {

    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while(tc-- > 0) {
            Deque<Integer> deque = new ArrayDeque<>();

            String command = br.readLine();
            int size = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for(int i=0; i<size; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            
            AC(command, deque);            
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());

    }

    static void AC(String command, Deque<Integer> deque) {

        boolean isFirst = true;
        for(char c : command.toCharArray()) {
            if(c == 'R') {
                isFirst = !isFirst;
                continue;
            }

            if(!isFirst) {
                if(deque.pollLast() == null) {
                    sb.append("error\n");
                    return ;
                }
            } else {
                if(deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }

        makeResult(deque, isFirst);
    }

    static void makeResult(Deque<Integer> dq, boolean isFirst) {

        sb.append("[");

        // D를 마지막으로 수행한 이후에 Deque가 비어있더라도 "[]" 을 반환해주어야 함.
        if(!dq.isEmpty()) {

            if(!isFirst) {
                sb.append(dq.pollLast());
                
                while(!dq.isEmpty()) {
                    sb.append("," + dq.pollLast());
                }

            } else {
                sb.append(dq.pollFirst());
                
                while(!dq.isEmpty()) {
                    sb.append("," + dq.pollFirst());
                }
            }
        }
        sb.append("]\n");

    }
}
