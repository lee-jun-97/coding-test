package com.programmers.devmatching;

public class dev_2022_2 {
    
    public static void main(String[] args) {

        solution(4, true);
        
    }

    public static int[][] solution(int n, boolean horizontal) {
        int[][] answer ={};
        int count = 1;
        int i= 0, j = 0;

        answer[i][j] = count;

        while(count <= n*n) {
            if(horizontal == true) {
                j++;
                count++;
                answer[i][j] = count;
            }
            if(horizontal == false) {
                i++;
                count++;
                answer[i][j] = count;
            }

        }
        

        return answer;
    }
}
