package com.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SSG_1 {

    public static void main(String[] args) {
        
        int[] v = {6,5,3};
        int a = 3;
        int b = 2;

        // int[] v = {4,4,3};
        // int a = 2;
        // int b = 1;


        int result = solution(v, a, b);

        System.out.println(result);


    }
    
    public static int solution(int[]v, int a, int b) {
        List<Integer> list = Arrays.stream(v).boxed().collect(Collectors.toList());

        return cal(list, 0, a, b, list.size());
    }

    static int cal(List<Integer> list, int count, int a, int b, int length) {

        Collections.sort(list, Collections.reverseOrder());

        int first = list.get(0);

        if(first < a) {
            return count;
        } else {
            list.set(0, first - a);
            for(int i=1; i<length; i++) {
                int value = list.get(i);
                if(value < b ) {
                    return count;
                } else {
                    list.set(i, value - b);
                }
            }
        }

        count++;
        
        return cal(list, count, a, b, length);
    }
}
