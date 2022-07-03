package com.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S4_1620 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nums = br.readLine().split(" ");

        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<Integer.parseInt(nums[0]); i++) {
            String temp = br.readLine();
            list.add(temp);
            // 이후 입력 값 그대로 get 하기 위해 처음부터 +1 하여 넣음.
            map.put(temp, i+1);
        }

        for(int i=0; i<Integer.parseInt(nums[1]); i++) {
            String temp = br.readLine();

            // 숫자일 경우
            if(map.get(temp) == null) {
                // index는 0부터 시작하기 때문에 -1 해줌.
                sb.append(list.get(Integer.parseInt(temp)-1)).append("\n");
            } else {
                sb.append(map.get(temp)).append("\n");
            }
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

}
