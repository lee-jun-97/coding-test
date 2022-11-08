package com.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1063 {

    static String king;
    static String stone;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        king = st.nextToken();
        stone = st.nextToken();

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

        System.out.println(king);
        System.out.println(stone);

    }

    static boolean isEqual(String king, String stone) {
        return king.equals(stone)==true?true:false;
    }

    static boolean isOk(String str) {

        if(str.charAt(0) == '@' || str.charAt(0) == 'I') {
            return false;
        }

        if(str.charAt(1) == '0' || str.charAt(1) == '9') {
            return false;
        }

        return true;
    }

    static void R() {
        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append((char)(kingArr[0] + 1)).append(kingArr[1]).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append((char)(stoneArr[0] + 1)).append(stoneArr[1]).toString();

            if(!isOk(temp_2)) {
                return ;
            }
            stone = temp_2;
        }

        king = temp;
    }

    static void L() {

        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append((char)(kingArr[0] - 1)).append(kingArr[1]).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append((char)(stoneArr[0] - 1)).append(stoneArr[1]).toString();

            if(!isOk(temp_2)) {
                return ;
            }

            stone = temp_2;
        }

        king = temp;
    }

    static void B() {
        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append(kingArr[0]).append((char)(kingArr[1] - 1)).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append(stoneArr[0]).append((char)(stoneArr[1] - 1)).toString();

            if(!isOk(temp_2)) {
                return ;
            }

            stone = temp_2;
        }

        king = temp;
    }
    
    static void T() {
        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append(kingArr[0]).append((char)(kingArr[1] + 1)).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append(stoneArr[0]).append((char)(stoneArr[1] + 1)).toString();

            if(!isOk(temp_2)) {
                return ;
            }

            stone = temp_2;
        }

        king = temp;
    }

    static void RT() {
        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append((char)(kingArr[0] + 1)).append((char)(kingArr[1] + 1)).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append((char)(stoneArr[0] + 1)).append((char)(stoneArr[1] + 1)).toString();

            if(!isOk(temp_2)) {
                return ;
            }
            stone = temp_2;
        }

        king = temp;
    }

    static void LT() {

        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append((char)(kingArr[0] - 1)).append((char)(kingArr[1] + 1)).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append((char)(stoneArr[0] - 1)).append((char)(stoneArr[1] + 1)).toString();

            if(!isOk(temp_2)) {
                return ;
            }
            stone = temp_2;
        }

        king = temp;
    }

    static void RB() {

        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append((char)(kingArr[0] + 1)).append((char)(kingArr[1] - 1)).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append((char)(stoneArr[0] + 1)).append((char)(stoneArr[1] - 1)).toString();

            if(!isOk(temp_2)) {
                return ;
            }
            stone = temp_2;
        }

        king = temp;
    }

    static void LB() {

        char[] kingArr = king.toCharArray();

        StringBuilder sb = new StringBuilder();
        String temp = sb.append((char)(kingArr[0] - 1)).append((char)(kingArr[1] - 1)).toString();

        if(!isOk(temp)) {
            return ;
        }

        String temp_2 = "";

        if(isEqual(temp, stone)) {
            char[] stoneArr = stone.toCharArray();

            sb = new StringBuilder();
            temp_2 = sb.append((char)(stoneArr[0] - 1)).append((char)(stoneArr[1] - 1)).toString();

            if(!isOk(temp_2)) {
                return ;
            }
            stone = temp_2;
        }

        king = temp;
    }
}
