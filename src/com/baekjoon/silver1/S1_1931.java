package com.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S1_1931 {

    public static class Node {
        int start;
        int end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Node> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            list.add(new Node(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        // 왜 끝나는 시간 순으로 정렬해야 할까 ?
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node e1, Node e2) {
                if(e1.end == e2.end) {
                    return e1.start - e2.start;
                }
                return e1.end - e2.end;
            }
        });
        
        int e = 0;
        int result = 0;

        // 왜 for문을 한 번만 써서도 판단이 되는 걸까
        for(int i=0; i<n; i++) {
            if(list.get(i).start >= e) {
                e = list.get(i).end;
                result++;
            }
        }

        System.out.println(result);
    }
}