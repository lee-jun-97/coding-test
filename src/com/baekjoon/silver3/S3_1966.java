package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S3_1966 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        
        for(int i=0; i<tc; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
    
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            LinkedList<int[]> queue = new LinkedList<>();
            
            int cnt = 0;

            for(int j=0; st2.hasMoreTokens(); j++) {
                queue.add(new int[] {j, Integer.parseInt(st2.nextToken())});
            }

            while(!queue.isEmpty()) {

                int[] temp = queue.poll();
                boolean check = true;

                for(int j=0; j<queue.size(); j++) {
                    if(temp[1] < queue.get(j)[1]) {
                        queue.add(temp);
                        
                        for(int k=0; k<j; k++) {
                            queue.add(queue.poll());
                        }

                        check = false;
                        break;
                    }
                }

                if(!check) {
                    continue;
                }

                cnt++;

                if(temp[0] == m) {
                    break;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb.toString());

    }

}
