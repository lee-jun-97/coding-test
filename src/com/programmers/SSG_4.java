package com.programmers;

public class SSG_4 {

    public static void main(String[] args) {
        
    }

    public String[] solution(int[][] macaron) {

        String[] answer = {};

        int[][] board = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};

        for(int[] i : macaron) {
            for(int j=0; j<6; j++) {

                if(board[j][i[0]] != 0) {
                    board[j-1][i[0]] = i[1];
                } else if(j == 5 && board[j][i[0]] == 0) {
                    board[j][i[0]] = i[1];
                }

                
            }
        }

        return answer;
    }

}
