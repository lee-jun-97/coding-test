package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1063 {

    static char[] king;
    static char[] stone;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        king = st.nextToken().toCharArray();
        stone = st.nextToken().toCharArray();

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            String temp = br.readLine();
            
            switch(temp) {
                case "R" : R(); break;
                case "L" : L(); break;
                case "B" : B(); break;
                case "T" : T(); break;
                case "RT" : RT(); break;
                case "LT" : LT(); break;
                case "RB" : RB(); break;
                case "LB" : LB(); break;
            }
        }

        System.out.print(king[0]);
        System.out.println(king[1]);
        System.out.print(stone[0]);
        System.out.println(stone[1]);
    }

    public static void R() {

        char temp_king = (char)(king[0] + 1);
        
        if(temp_king <= 'H') {
            if(temp_king == stone[0] && king[1] == stone[1]) {
                char temp_stone = (char)(stone[0] + 1);
                if(temp_stone <= 'H') {
                    stone[0] = temp_stone;
                    king[0] = temp_king;
                }
            } else {
                king[0] = temp_king;
            }
        }

    }

    public static void L() {

        char temp_king = (char)(king[0] - 1); 
        
        if(temp_king >= 'A') {
            if(temp_king == stone[0] && king[1] == stone[1]) {
                char temp_stone = (char)(stone[0] - 1);
                if(temp_stone >= 'A') {
                    stone[0] = temp_stone;
                    king[0] = temp_king;
                }
            } else {
                king[0] = temp_king;
            }
        }

    }

    public static void B() {

        char temp_king = (char)(king[1] - 1);

        if(temp_king >= '1') {
            if(king[0] == stone[0] && temp_king == stone[1]) {
                char temp_stone = (char)(stone[1] - 1);
                if(temp_stone >= '1') {
                    stone[1] = temp_stone;
                    king[1] = temp_king;
                }
            } else {
                king[1] = temp_king;
            }
        }

    }

    public static void T() {

        char temp_king = (char)(king[1] + 1);

        if(temp_king <= '8') {
            if(king[0] == stone[0] && temp_king == stone[1]) {
                char temp_stone = (char)(stone[1] + 1);
                if(temp_stone <= '8') {
                    stone[1] = temp_stone;
                    king[1] = temp_king;
                }
            } else {
                king[1] = temp_king;
            }
        }

    }

    public static void RT() {

        char temp_king_1 = (char)(king[0] + 1);
        char temp_king_2 = (char)(king[1] + 1);

        if(temp_king_1 <= 'H' && temp_king_2 <= '8') {


            if(temp_king_1 == stone[0] && temp_king_2 == stone[1]) {

                char temp_stone_1 = (char)(stone[0] + 1);
                char temp_stone_2 = (char)(stone[1] + 1);

                if(temp_stone_1 <= 'H' && temp_stone_2 <= '8') {
                    stone[0] = temp_stone_1;
                    stone[1] = temp_stone_2;
                    king[0] = temp_king_1;
                    king[1] = temp_king_2;
                }
            } else {
                king[0] = temp_king_1;
                king[1] = temp_king_2;
            }
        }

    }

    public static void LT() {

        char temp_king_1 = (char)(king[0] - 1);
        char temp_king_2 = (char)(king[1] + 1);

        if(temp_king_1 >= 'A' && temp_king_2 <= '8') {

            if(temp_king_1 == stone[0] && temp_king_2 == stone[1]) {

                char temp_stone_1 = (char)(stone[0] - 1);
                char temp_stone_2 = (char)(stone[1] + 1);

                if(temp_stone_1 <= 'A' && temp_stone_2 <= '8') {
                    stone[0] = temp_stone_1;
                    stone[1] = temp_stone_2;
                    king[0] = temp_king_1;
                    king[1] = temp_king_2;
                }

            } else {
                king[0] = temp_king_1;
                king[1] = temp_king_2;
            }
        }

    }

    public static void RB() {

        char temp_king_1 = (char)(king[0] + 1);
        char temp_king_2 = (char)(king[1] - 1);

        if(temp_king_1 <= 'H' && temp_king_2 >= '1') {

            if(temp_king_1 == stone[0] && temp_king_2 == stone[1]) {

                char temp_stone_1 = (char)(stone[0] + 1);
                char temp_stone_2 = (char)(stone[1] - 1);

                if(temp_stone_1 <= 'H' && temp_stone_2 >= '1') {
                    stone[0] = temp_stone_1;
                    stone[1] = temp_stone_2;
                    king[0] = temp_king_1;
                    king[1] = temp_king_2;
                }

            } else {
                king[0] = temp_king_1;
                king[1] = temp_king_2;
            }
        }

    }

    public static void LB() {

        char temp_king_1 = (char)(king[0] - 1);
        char temp_king_2 = (char)(king[1] - 1);

        if(temp_king_1 >= 'A' && temp_king_2 >= '1') {

            if(temp_king_1 == stone[0] && temp_king_2 == stone[1]) {

                char temp_stone_1 = (char)(stone[0] - 1);
                char temp_stone_2 = (char)(stone[1] - 1);

                if(temp_stone_1 >= 'A' && temp_stone_2 >= '1') {
                    stone[0] = temp_stone_1;
                    stone[1] = temp_stone_2;
                    king[0] = temp_king_1;
                    king[1] = temp_king_2;
                }

            } else {
                king[0] = temp_king_1;
                king[1] = temp_king_2;
            }
        }

    }
}
