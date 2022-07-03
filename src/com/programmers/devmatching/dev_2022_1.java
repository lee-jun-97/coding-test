package com.programmers.devmatching;

public class dev_2022_1 {
    
    public static void main(String[] args) {
        
        int[] grade = {3, 2, 1, 6, 5, 4};
        int result = solution(grade);

        System.out.println(result);
    }

    public static int solution(int[] grade) {
        int answer = 0;

        int i = 0;
        int index = 1;
        int temp = 0;
        while(index<grade.length) {
            if(grade[index] > grade[i]) {
                for(int j=index-2; j>=temp; j--) {
                    int diff = grade[j] - grade[i];
                    answer += diff;
                }
                temp = i+1;
            }

            if(index == grade.length -1) {
                for(int j=temp; j<=index; j++) {
                    int diff = grade[j] - grade[index];
                    answer += diff;
                }
            }
            i++;
            index++;
        }

        // for(int i=0; i<grade.length-1; i++) {
        //     int diff = 0;
        //     if(grade[i] > grade[i+1]) {
        //         diff = grade[i] - grade[i+1];
        //         grade [i] = grade[i+1];
        //     }

        //     answer += diff;
        // }

        return answer;
    }

}
