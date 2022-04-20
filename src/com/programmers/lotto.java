package com.programmers;

public class lotto {

    public static void main(int[] lottos, int[] win_nums) {
        
        int[] answer = new int[2];
        int equals = 0;
        int temp = 0;
        
        for(int i : lottos) {
            if(i == 0) {
                temp++;
            } else {
                for(int j=0; j<win_nums.length; j++) {
                    if(i == win_nums[j]) {
                       equals++; 
                    }
                }
            }

        }
        
        int max = equals + temp;
        int min = equals ;
        
        switch(max) {
            case 6 : answer[0] = 1; break;
            case 5 : answer[0] = 2; break;
            case 4 : answer[0] = 3; break;
            case 3 : answer[0] = 4; break;
            case 2 : answer[0] = 5; break;
            default : answer[0] = 6; break;
        }
        
        switch(min) {
            case 6 : answer[1] = 1; break;
            case 5 : answer[1] = 2; break;
            case 4 : answer[1] = 3; break;
            case 3 : answer[1] = 4; break;
            case 2 : answer[1] = 5; break;
            default : answer[1] = 6; break;
        }
    }
    
}
