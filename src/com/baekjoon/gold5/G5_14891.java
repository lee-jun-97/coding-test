package com.baekjoon.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class G5_14891 {

    static ArrayList<LinkedList<Integer>> arr;
    static int left_idx = 6;
    static int right_idx = 2;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new ArrayList<>();

        for(int i=0; i<4; i++) {
            String input = br.readLine();

            arr.add(i, new LinkedList<>());

            for(int j=0; j<input.length(); j++) {
                arr.get(i).add(j, Integer.parseInt(String.valueOf(input.charAt(j))));
            }
        }

        int K = Integer.parseInt(br.readLine());

        for(int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            turn(num-1, direction);
        }

        int sum = 0;

        for(int i=0; i<4; i++) {
            if(arr.get(i).getFirst() == 1) {
                switch(i) {
                    case 0 : sum += 1; break;
                    case 1 : sum += 2; break;
                    case 2 : sum += 4; break;
                    case 3 : sum += 8; break;
                }
            }
        }

        System.out.println(sum);
    }

    public static void turn(int num, int direction) {

        int[] direct = new int[4];

        direct[num] = direction;

        rightside(num, direct);
        leftside(num, direct);

        for(int i=0; i<4; i++) {
            int temp_direction = direct[i];
            if(temp_direction == 1) {
                int temp = arr.get(i).removeLast();
                arr.get(i).addFirst(temp);
            } else if(temp_direction == -1) {
                int temp = arr.get(i).removeFirst();
                arr.get(i).addLast(temp);
            }
        }
        

    }

    public static void leftside(int num, int[] direct) {

        for(int i=num; i>0; i--) {
            if(arr.get(i).get(left_idx) != arr.get(i-1).get(right_idx)) {
                direct[i-1] = -direct[i];
            }
        }
        
    }

    public static void rightside(int num, int[] direct) {

        for(int i=num; i<3; i++) {
            if(arr.get(i).get(right_idx) != arr.get(i+1).get(left_idx)) {
                direct[i+1] = -direct[i];
            }
        }

    }

}
