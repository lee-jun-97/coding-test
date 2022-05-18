package com.programmers;

public class kakao_intern_2 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {3,2,7,2} ;
		int[] arr2 = {4,6,5,1} ;
		
		System.out.println(solution(arr1, arr2) );
		
	}
	
	public static int solution(int[] queue1, int[] queue2) {
		
		int answer = -2;
		long sum = 0;
		long sum_1 = 0;
		long sum_2 = 0;
		
		for(int i : queue1) {
			sum += i;
		}
		
		sum_1 = sum ;
		
		for(int i : queue2) {
			sum += i;
			sum_2 += i;
		}
		
		long diff = Math.abs(sum_1 - sum_2);
		
		System.out.println(diff);
		
		
		long result = sum / 2 ;
		
		System.out.println(result);
		
		
		return answer;
	}

}
